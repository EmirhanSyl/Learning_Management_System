package com.blackflower.curriculumcreator.jpa.repository;

import com.blackflower.curriculumcreator.jpa.model.*;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
public class StudentClassRepository {

    private EntityManagerFactory emf;
    private final EntityManager entityManager;

    public StudentClassRepository(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        entityManager = emf.createEntityManager();
    }

    public StudentClassRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Saves the specified class to the database.
     *
     * @param studentClass The class to save to the database.
     * @return The saved student class, wrapped in an optional, or
     * Optional.empty() if the save operation fails.
     */
    public Optional<StudentClass> save(StudentClass studentClass) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(studentClass);
            entityManager.getTransaction().commit();
            return Optional.of(studentClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    /**
     * Finds the class with the specified ID.
     *
     * @param id The ID of the class to find.
     * @return The requested student class, wrapped in an optional, if it
     * exists, otherwise Optional.empty().
     */
    public Optional<StudentClass> findById(Integer id) {
        StudentClass studentClass = entityManager.find(StudentClass.class, id);
        return studentClass != null ? Optional.of(studentClass) : Optional.empty();
    }

    /**
     * Returns a list of all classes in the database.
     *
     * @return A list of all classes in the database.
     */
    public List<StudentClass> findAll() {
        return entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList();
    }

    public void removeLesson(StudentClass sc, Lesson lesson) {
        for (CourseSession courseSession : sc.getCoursesessionList()) {
            if (courseSession.getLessonId().equals(lesson)) {
                entityManager.remove(courseSession);
            }
        }
        sc.getLessons().remove(lesson);

        entityManager.getTransaction().begin();
        entityManager.persist(sc);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
    }

    /**
     * Deletes the class with the specified ID. This method deletes the class
     * and all references to its students, but does not delete the students
     * themselves.
     *
     * @param id The ID of the class to delete.
     */
    public void deleteById(Integer id) {
        StudentClass studentClass = entityManager.find(StudentClass.class, id);
        if (studentClass != null) {
            try {
                entityManager.getTransaction().begin();

                studentClass.getCoursesessionList().forEach((courseSession) -> {
                    entityManager.remove(courseSession);
                });

                entityManager.createNamedQuery("Person.findAllStudents", Student.class).getResultList().forEach((student) -> {
                    if (student.getStudentClass() != null && student.getStudentClass().equals(studentClass)) {
                        student.setStudentClass(null);
                    }
                });

                studentClass.getCoursesessionList().forEach((courseSession) -> {
                    entityManager.remove(courseSession);
                });

                entityManager.remove(studentClass);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

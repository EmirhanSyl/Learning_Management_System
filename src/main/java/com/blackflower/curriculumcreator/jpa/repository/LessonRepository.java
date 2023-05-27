
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
public class LessonRepository {

    private EntityManagerFactory emf;
    private EntityManager entityManager;

    public LessonRepository(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        entityManager = emf.createEntityManager();
    }

    public LessonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    

    /**
     * Saves the specified movie to the database.
     *
     * @param lesson The lesson to save to the database.
     * @return The saved lesson, wrapped in an optional, or Optional.empty() if the save operation fails.
     */
    public Optional<Lesson> save(Lesson lesson) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(lesson);
            entityManager.getTransaction().commit();
            return Optional.of(lesson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    /**
     * Finds the lesson with the specified ID.
     *
     * @param id The ID of the lesson to find.
     * @return The requested lesson, wrapped in an optional, if it exists, otherwise Optional.empty().
     */
    public Optional<Lesson> findById(Integer id) {
        Lesson lesson = entityManager.find(Lesson.class, id);
        return lesson != null ? Optional.of(lesson) : Optional.empty();
    }

    /**
     * Returns a list of all lessons in the database.
     *
     * @return A list of all lessons in the database.
     */
    public List<Lesson> findAll() {
        return entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList();
        //return entityManager.createQuery("from Lesson").getResultList();
    }

    /**
     * Deletes the lesson with the specified ID. This method deletes the lesson and all references to its instructors,
     * but does not delete the instrucotrs themselves.
     *
     * @param id The ID of the lesson to delete.
     */
    public void deleteById(Integer id) {
        Lesson lesson = entityManager.find(Lesson.class, id);
        if (lesson != null) {
            try {
                entityManager.getTransaction().begin();

                lesson.getInstructorLessonList().forEach(instructorLesson -> {
                    entityManager.remove(instructorLesson);
                });
                lesson.getCoursesessionList().forEach((courseSession) ->{
                    entityManager.remove(courseSession);
                });
                lesson.getLessonTopicList().forEach((lessonTopic) -> {
                    entityManager.remove(lessonTopic);
                });
                

                entityManager.remove(lesson);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

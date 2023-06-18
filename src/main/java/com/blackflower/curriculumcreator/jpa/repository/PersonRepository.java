
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
public class PersonRepository {

    private EntityManagerFactory emf;
    private EntityManager entityManager;

    public PersonRepository(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        entityManager = emf.createEntityManager();
    }

    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    

    /**
     * Saves the specified movie to the database.
     *
     * @param person The person to save to the database.
     * @return The saved person, wrapped in an optional, or Optional.empty() if the save operation fails.
     */
    public Optional<Person> save(Person person) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
            return Optional.of(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    /**
     * Finds the person with the specified ID.
     *
     * @param id The ID of the person to find.
     * @return The requested person, wrapped in an optional, if it exists, otherwise Optional.empty().
     */
    public Optional<Person> findById(Integer id) {
        Person person = entityManager.find(Person.class, id);
        return person != null ? Optional.of(person) : Optional.empty();
    }

    /**
     * Returns a list of all persons in the database.
     *
     * @return A list of all persons in the database.
     */
    public List<Person> findAll() {
        return entityManager.createNamedQuery("Person.findAll", Person.class).getResultList();
    }
    
    public List<Instructor> findAllInstructors() {
        return entityManager.createNamedQuery("Person.findAllIInstructors", Instructor.class).getResultList();
    }
    public List<Admin> findAllAdmins() {
        return entityManager.createNamedQuery("Person.findAllAdmins", Admin.class).getResultList();
    }
    
    public List<Student> findAllStudents() {
        return entityManager.createNamedQuery("Person.findAllStudents", Student.class).getResultList();
    }

    /**
     * Deletes the person with the specified ID. This method deletes the persons and all references to its lessons,
     * but does not delete the instrucotrs themselves.
     *
     * @param id The ID of the lesson to delete.
     */
    public void deleteById(Integer id) {
        Person person = entityManager.find(Person.class, id);
        if (person != null) {
            try {
                entityManager.getTransaction().begin();
                if (person instanceof Instructor instructor) {
                    instructor.getLessons().forEach(instructorLesson -> {
                    entityManager.remove(instructorLesson);
                    });
                }else if (person instanceof Student student) {
                    student.setStudentClass(null);
                }else if (person instanceof Admin admin) {
                    
                }

                entityManager.remove(person);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

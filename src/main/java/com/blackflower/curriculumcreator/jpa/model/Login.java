package com.blackflower.curriculumcreator.jpa.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author emirs
 */
public class Login {

    public static Person loginValidation(String username, String password) {
        Person person = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();

        Query query = entityManager.createQuery("SELECT p FROM Person p WHERE p.username = :username AND p.password = :password")
                .setParameter("username", username)
                .setParameter("password", password);

        List<Person> matchingPersons = query.getResultList();

        if (!matchingPersons.isEmpty()) {
            // Username and password match
            person = matchingPersons.get(0);
        }
        
        return person;
    }
}

package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.MainFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

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
    
    public static Person checkRememberMe() {
        String filename = "C:\\Users\\emirs\\Documents\\NetBeansProjects\\CurriculumCreator\\settings\\rememberMe.txt";

        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        Person user = null;
        if (lines.size() == 2) {
            user = loginValidation(lines.get(0), lines.get(1));
        }
        
        return user;
    }
}

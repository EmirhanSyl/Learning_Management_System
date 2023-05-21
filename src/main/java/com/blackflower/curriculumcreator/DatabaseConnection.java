package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.jpa.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
public class DatabaseConnection {

    static Connection conn;

    public static void Connect() {
        try {
            conn = DriverManager.getConnection("jdbc:derby:C:/Users/emirs/Documents/Derby/persons");
            System.out.println("CONNECTED!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
//        EntityManager entityManager = emf.createEntityManager();
//        entityManager.getTransaction().begin();
//
//        Instructor instructor = new Instructor();
//        instructor.setPersonId(1);
//        instructor.setFirstName("Ali");
//        instructor.setLastName("Nizam");
//        instructor.setUsername("AliNizam");
//        instructor.setPassword("123");
//        instructor.setImagePath("");
//
//        Lesson lesson = new Lesson();
//        lesson.setLessonId(1);
//        lesson.setLessonName("CPII");
//
//        entityManager.persist(instructor);
//        entityManager.persist(lesson);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        emf.close();
        
        AddLessonToInstructor();
    }

    public static void AddLessonToInstructor() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        
//        Instructor instructor = new Instructor();
//        instructor.setPersonId(3);
//        instructor.setFirstName("Burçin");
//        instructor.setLastName("Danacı");
//        instructor.setUsername("BurcinDanaci");
//        instructor.setPassword("123");
//        instructor.setImagePath("");
//        
//        Lesson lesson = new Lesson();
//        lesson.setLessonId(3);
//        lesson.setLessonName("PhysicsII");
//        
//        ArrayList<Instructor> instructors = new ArrayList<>();
//        instructors.add(instructor);
//        
//        lesson.setInstructors(instructors);
        
        Instructor instructor = entityManager.find(Instructor.class, 3);
        System.out.println("Instructor: " + instructor.toString() + " Lesson: " + instructor.getLessons().size());
        //Lesson lesson = entityManager.find(Lesson.class, 1);
        //System.out.println("Lesson found: " + lesson.getLessonName());
        //instructor.getLessons().add(lesson);
//        System.out.println("Lessson added to the instructor");
//        lesson.getInstructors().add(instructor);
//        System.out.println("instructor added to the lesson");
        
        entityManager.persist(instructor);
        //entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }

}   

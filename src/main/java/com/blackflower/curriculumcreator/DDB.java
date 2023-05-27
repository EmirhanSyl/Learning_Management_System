
package com.blackflower.curriculumcreator;

import com.blackflower.curriculumcreator.jpa.model.*;
import com.blackflower.curriculumcreator.jpa.repository.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
public class DDB {
    //ALTER TABLE Instructor_Lesson ADD FOREIGN KEY (lesson_id) REFERENCES Lesson(id)

    static String url = "jdbc:mysql://213.238.179.38:3306/httpsnzj_java_db";
    static String username = "httpsnzj_java_user";
    static String password = "Emir_Soylu1331";
    public static void main(String[] args) {
        //ConnectDatabase();
        //InsertEnteties();
        //QueryEntities();
        //ManyToMany();
        //InsertEmployee();
        //CompositeKeyMany();
        //QueryM2M();
        //insertEntitiesViaRepository();
        //updateEntitiesViaRepository();
        ///giveEntitiesViaRepository();
        //deleteEntitiesViaRepoitory();
        //many21();
        //queryMany21();
        //one2Many();
        //query12Many();
        //createCourseSession();
        //queryCourseSession();
        //many21Update();
        //AddClassToLesson();
        testQuery();
    }
    
    public static void testQuery(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        StudentClass selectedClass = entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList().get(0);
        List<CourseSession> sessions = entityManager.
                createQuery("SELECT c FROM CourseSession c WHERE c.classId = :classID", CourseSession.class)
                .setParameter("classID", selectedClass).getResultList();
        
        System.out.println(sessions.size());
        sessions.forEach((session) -> {
            System.out.println(session.toString());
        });
        
        entityManager.close();
        emf.close();
    }
    
    public static void AddClassToLesson(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        
        Lesson l1 = entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList().get(0);
        Lesson l2 = entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList().get(1);
        StudentClass c1 = entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList().get(0);
        
        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(l1);
        lessons.add(l2);
        
        c1.setLessons(lessons);
        
        entityManager.persist(c1);
        entityManager.persist(l1);
        entityManager.persist(l2);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
        
    }
    
    public static void createCourseSession(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        
        StudentClass studentClass = entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList().get(0);
        Lesson lesson = entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList().get(0);
        LocalDateTime timestamp = LocalDateTime.of(2023, 3, 3, 2, 30, 0);
        Date startDate = Date.from(timestamp.atZone(ZoneId.systemDefault()).toInstant());
        
        CourseSession courseSession = new CourseSession(startDate, Integer.SIZE, studentClass, lesson);
        studentClass.getCoursesessionList().add(courseSession);
        lesson.getCoursesessionList().add(courseSession);
        
        entityManager.persist(studentClass);
        entityManager.persist(lesson);
        entityManager.persist(courseSession);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
    
    public static void queryCourseSession(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        StudentClass studentClass = entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList().get(0);
        
        studentClass.getCoursesessionList().forEach((courseSession)->{System.out.println(courseSession.toString());});
    }
    
    public static void one2Many(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        
        Lesson lesson = entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList().get(0);
        LessonTopic topic1 = new LessonTopic(1, "JPA Usage", lesson);
        LessonTopic topic2 = new LessonTopic(1, "Swing Usage", lesson);
        LessonTopic topic3 = new LessonTopic(1, "Swing Components", lesson);
        LessonTopic topic4 = new LessonTopic(1, "SQL Usage", lesson);
        
        ArrayList<LessonTopic> topics = new ArrayList<>();
        topics.add(topic1);
        topics.add(topic2);
        topics.add(topic3);
        topics.add(topic4);
        
        lesson.setLessonTopicList(topics);
        
        entityManager.persist(topic1);
        entityManager.persist(topic2);
        entityManager.persist(topic3);
        entityManager.persist(topic4);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        
    }
    
    public static void query12Many(){
        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        Lesson lesson = lessonRepository.findAll().get(0);
        lesson.getLessonTopicList().forEach((topic) -> {System.out.println(topic.toString());});
    }
    
    public static void queryMany21(){
        PersonRepository personRepository = new PersonRepository("LMS_PE");
        for (Student student : personRepository.findAllStudents()) {
            System.out.println("Student: " + student.toString() + " Class: " + student.getStudentClass().getName());
        }
    }
    
    public static void many21(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        StudentClass studentClass = new StudentClass("Software Engineering");
        Student student = new Student(studentClass, "Meryem", "Kılıç", "MeryemKilic", "123", "");
        
        entityManager.persist(studentClass);
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
    
    public static void many21Update(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Student student = entityManager.createNamedQuery("Person.findAllStudents", Student.class).getResultList().get(0);
        student.setStudentClass(null);
        
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
    
    
    public static void ConnectDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection connection = DriverManager.getConnection(url, username, password);
            
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM test_java_db");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + 
                        " " + resultSet.getString(3) + " " + resultSet.getString(4));
            }
            connection.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void InsertEnteties(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Lesson lesson1 = new Lesson("CP-II");
        Lesson lesson2 = new Lesson("CP-I");
        Lesson lesson3 = new Lesson("Calculus-II");
        Lesson lesson4 = new Lesson("Physics-II");
        
        Instructor instrucor1 = new Instructor("Ali", "Nizam", "AliNizam", "123", "");
        Instructor instrucor2 = new Instructor("Nazlı", "Doğan", "NazliDogan", "123", "");
        Instructor instrucor3 = new Instructor("Burçin", "Danacı", "BurcinDanaci", "123", "");
        
        InstructorLesson instructorLesson1 = new InstructorLesson(5, lesson1, instrucor1);
        InstructorLesson instructorLesson2 = new InstructorLesson(5, lesson2, instrucor1);
        ArrayList<InstructorLesson> instructorLessons1 = new ArrayList<>();
        instructorLessons1.add(instructorLesson1);
        instructorLessons1.add(instructorLesson2);
        instrucor1.setLessons(instructorLessons1);
        lesson1.setInstructorLessonList(instructorLessons1);
        lesson2.setInstructorLessonList(instructorLessons1);
        
        InstructorLesson instructorLesson3 = new InstructorLesson(5, lesson3, instrucor2);
        ArrayList<InstructorLesson> instructorLessons2 = new ArrayList<>();
        instructorLessons1.add(instructorLesson3);
        instrucor2.setLessons(instructorLessons2);
        lesson3.setInstructorLessonList(instructorLessons2);
        
        InstructorLesson instructorLesson4 = new InstructorLesson(3, lesson4, instrucor3);
        ArrayList<InstructorLesson> instructorLessons3 = new ArrayList<>();
        instructorLessons1.add(instructorLesson4);
        instrucor3.setLessons(instructorLessons3);
        lesson4.setInstructorLessonList(instructorLessons3);        
        
        entityManager.persist(lesson1);
        entityManager.persist(lesson2);
        entityManager.persist(lesson3);
        entityManager.persist(lesson4);
        entityManager.persist(instrucor1);
        entityManager.persist(instrucor2);
        entityManager.persist(instrucor3);
        entityManager.persist(instructorLesson1);
        entityManager.persist(instructorLesson2);
        entityManager.persist(instructorLesson3);
        entityManager.persist(instructorLesson4);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        emf.close();
    }
    
    public static void QueryEntities(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Instructor  instructor = entityManager.find(Instructor.class, 5);
        
        for (InstructorLesson lesson : instructor.getLessons()) {
            System.out.println(lesson.toString());
        }

        entityManager.persist(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
    
    public static void ManyToMany(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test_JPA");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 53);
//        Job job11 = entityManager.find(Job.class, 51);
//        Job job12 = entityManager.find(Job.class, 52);
//        
//        System.out.println("Person getted: " + person.getName());
//        System.out.println("Job getted: " + job11.getTitle());
//        System.out.println("Job getted: " + job12.getTitle());
//        
//        for (Job job : person.getJobs()) {
//            System.out.println("Person: " + person.getName() + " has this job: " + job.getTitle());
//        }
//        
//        System.out.println("Job: " + job11.getTitle() + " has this person: " + person.getName());
//        
////        person.getJobs().add(job12);
////        System.out.println("Job: " + job12.getTitle() + " gave to the person: " + person.getName());
//        
//        entityManager.persist(job11);
//        entityManager.persist(job12);
//        entityManager.persist(person);
//        entityManager.getTransaction().commit();
//        
        entityManager.close();
        emf.close();
    }
    
    public static void CompositeKeyMany(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test_JPA");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
//        Employee emp = entityManager.find(Employee.class, 101);
//        Works w1 = entityManager.find(Works.class, 11);
//        
//        EmployeeWorks employeeWorks = new EmployeeWorks(66666, emp, w1);
//        
//        emp.getEmployeeWorksList().add(employeeWorks);
//        w1.getEmployeeWorksList().add(employeeWorks);
//        
//        entityManager.persist(emp);
//        entityManager.persist(w1);
//        entityManager.persist(employeeWorks);
//        entityManager.getTransaction().commit();
        
        entityManager.close();
        emf.close();
    }
    
    public static void QueryM2M(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test_JPA");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
//        Employee emp = entityManager.find(Employee.class, 101);
//        Works w1 = entityManager.find(Works.class, 11);
//        
//        System.out.println("Getted employee: " + emp.getName());
//        System.out.println("Getted employee: " + w1.getName());
//        
//        System.out.println("Employee: " + emp.getName() + " Job-0: " + emp.getJobs().get(0).getTitle() + " works: " + emp.getEmployeeWorksList().get(0).getWorksId().getName());
//        System.out.println("Work: " + w1.getName() + " Employees: " + w1.getEmployeeWorksList().get(0).getPersonId().getName() + " Time: " + w1.getEmployeeWorksList().get(0).getTotalTime());
//        
//        entityManager.persist(emp);
//        entityManager.persist(w1);
//        entityManager.getTransaction().commit();
//        
        entityManager.close();
        emf.close();
    }
    
    public static void insertEntitiesViaRepository(){
        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        Lesson lesson = new Lesson("English");
        lessonRepository.save(lesson);
    }
    public static void updateEntitiesViaRepository(){
        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        
        Lesson selectedLesson = null;
        for (Lesson lesson : lessonRepository.findAll()) {
            if (lesson.getName().equals("English")) {
                selectedLesson = lesson;
            }
        }
        
        selectedLesson.setName("Advance English");
        
        lessonRepository.save(selectedLesson);
    }
    
    public static void giveEntitiesViaRepository(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();
        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        
        Instructor instructor = entityManager.find(Instructor.class, 5);
        Lesson selectedLesson = null;
        for (Lesson lesson : lessonRepository.findAll()) {
            if (lesson.getName().equals("Advance English")) {
                selectedLesson = lesson;
            }
        }
        
        
        InstructorLesson instructorLesson = new InstructorLesson(2, selectedLesson, instructor);
        selectedLesson.getInstructorLessonList().add(instructorLesson);
        instructor.getLessons().add(instructorLesson);
        
        entityManager.persist(selectedLesson);
        entityManager.persist(instructor);
        entityManager.persist(instructorLesson);
        entityManager.getTransaction().commit();
        
    }
    
    public static void deleteEntitiesViaRepoitory(){
        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        lessonRepository.deleteById(51);
    }
}

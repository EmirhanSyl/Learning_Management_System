package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.repository.LessonRepository;
import com.blackflower.curriculumcreator.jpa.repository.PersonRepository;
import com.blackflower.curriculumcreator.jpa.repository.StudentClassRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author emirs
 */
public class Database {

    private static EntityManagerFactory emf;
    private static EntityManager entityManager;

    private static PersonRepository personRepository;
    private static LessonRepository lessonRepository;
    private static StudentClassRepository scr;

    public static void initDatabase(String persistenceUnitName) {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        entityManager = emf.createEntityManager();

        personRepository = new PersonRepository(entityManager);
        lessonRepository = new LessonRepository(entityManager);
        scr = new StudentClassRepository(entityManager);
    }

    public static void close() {
        try {
            entityManager.close();
            emf.close();
        } catch (Exception e) {
            System.out.println("entityManager already Closed!");
        }

    }

    public static List<Person> getUsers() {
        return personRepository.findAll();
    }

    public static List<StudentClass> getClasses() {
        return scr.findAll();
    }

    public static List<Lesson> getLessons() {
        return lessonRepository.findAll();
    }

    public static void addClass(String className) {
        StudentClass studentClass = new StudentClass(className);

        scr.save(studentClass);
    }

    public static StudentClass getStudentClass(int id) {
        return scr.findById(id).get();
    }

    public static ArrayList<Student> getClassStudents(StudentClass sc) {
        ArrayList<Student> result = new ArrayList<>();

        List<Student> students = personRepository.findAllStudents();
        personRepository.findAllStudents().forEach((student) -> {
            if (student.getStudentClass() != null && student.getStudentClass().equals(sc)) {
                result.add(student);
            }
        });
        return result;
    }

    public static void removeClass(StudentClass r_class) {
        scr.deleteById(r_class.getId());
    }

    public static void removeClass(int classId) {
        scr.deleteById(classId);
    }

    public static int remainedSessions(StudentClass sc, Lesson lesson) {
        List<CourseSession> sessions = entityManager.
                createQuery("SELECT c FROM CourseSession c WHERE c.classId = :classID", CourseSession.class)
                .setParameter("classID", sc).getResultList();

        InstructorLesson instructorLesson = entityManager
                .createQuery("SELECT l FROM InstructorLesson l WHERE l.lessonId = :lessonID", InstructorLesson.class)
                .setParameter("lessonID", lesson).getSingleResult();

        int usedSessions = 0;

        for (CourseSession session : sessions) {
            if (session.getLessonId().equals(lesson)) {
                usedSessions += session.getSessionLength();
            }
        }

        int remainedSessions = instructorLesson.getLessonCount() - usedSessions;

        return remainedSessions;
    }

    public static void createSession(Lesson lesson, StudentClass sessionClass, Date startDate, int sessionHours) {
        entityManager.getTransaction().begin();

        Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());
        StudentClass dbClass = entityManager.find(StudentClass.class, sessionClass.getId());

        CourseSession session = new CourseSession(startDate, sessionHours, dbClass, dbLesson);
        dbClass.getCoursesessionList().add(session);
        dbLesson.getCoursesessionList().add(session);

        entityManager.persist(session);
        entityManager.persist(dbClass);
        entityManager.persist(dbLesson);
        entityManager.getTransaction().commit();

        lesson.getCoursesessionList().add(session);
        sessionClass.getCoursesessionList().add(session);
    }

    public static Student addStudent(String firstName, String lastName, StudentClass studentClass) {
        entityManager.getTransaction().begin();

        String name = firstName.replaceAll("\\s", "");
        name = name.toLowerCase();
        String surname = lastName.replaceAll("\\s", "");
        surname = surname.toLowerCase();

        String imagePath = "C:\\Users\\emirs\\Desktop\\pics\\user.png";
        String username = name + surname;

        Query query = entityManager.createQuery("SELECT COUNT(u) FROM Person u WHERE u.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        if (count > 0) {
            int i = 0;
            String newUsername = username;
            while (count != 0) {
                newUsername = username+i;
                query.setParameter("username", newUsername);
                count = (Long) query.getSingleResult();
                i++;
            }
            username = newUsername;
        }

        String password = "123";
        Student student = new Student(studentClass, firstName, lastName, username, password, imagePath);
        student.setStudentClass(studentClass);

        entityManager.persist(student);
        entityManager.getTransaction().commit();
        
        return student;
    }

    public static Instructor addInstructor(String firstName, String lastName, Lesson lesson) {
        entityManager.getTransaction().begin();

        String name = firstName.replaceAll("\\s", "");
        name = name.toLowerCase();
        String surname = lastName.replaceAll("\\s", "");
        surname = surname.toLowerCase();

        String imagePath = "C:\\Users\\emirs\\Desktop\\pics\\user.png";
        String username = name + surname;
        String password = "123";
        
        Query query = entityManager.createQuery("SELECT COUNT(u) FROM Person u WHERE u.username = :username");
        query.setParameter("username", username);
        Long count = (Long) query.getSingleResult();

        if (count > 0) {
            int i = 0;
            String newUsername = username;
            while (count != 0) {
                newUsername = username+i;
                query.setParameter("username", newUsername);
                count = (Long) query.getSingleResult();
                i++;
            }
            username = newUsername;
        }
        
        
        Instructor instructor = new Instructor(firstName, lastName, username, password, imagePath);

        if (lesson != null) {
            Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());
            int lessonCount = dbLesson.getInstructorLessonList().get(0).getLessonCount();
            entityManager.remove(dbLesson.getInstructorLessonList().get(0));

            InstructorLesson instructorLesson = new InstructorLesson(lessonCount, dbLesson, instructor);
            ArrayList<InstructorLesson> instructorLessons = new ArrayList<>();
            instructorLessons.add(instructorLesson);

            instructor.setLessons(instructorLessons);
            lesson.getInstructorLessonList().add(instructorLesson);
            entityManager.persist(instructorLesson);
            //entityManager.merge(lesson);

        }

        entityManager.persist(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
        
        return instructor;
    }

    public static void addLesson(String lessonName, Instructor instructor, int lessonCount) {
        entityManager.getTransaction().begin();

        Lesson newLesson = new Lesson(lessonName);
        InstructorLesson instructorLesson = new InstructorLesson(lessonCount, newLesson, instructor);
        ArrayList<InstructorLesson> instructorLessons = new ArrayList<>();
        instructorLessons.add(instructorLesson);

        instructor.getLessons().add(instructorLesson);
        newLesson.setInstructorLessonList(instructorLessons);

        entityManager.persist(instructorLesson);
        entityManager.persist(instructor);
        entityManager.persist(newLesson);
        entityManager.getTransaction().commit();
    }

    public static void removeLesson(Lesson r_Lesson) {
        lessonRepository.deleteById(r_Lesson.getId());
    }

    public static void updateLessonData(int lessonid, Instructor newInstructor, int newLessonCount) {
        entityManager.getTransaction().begin();

        Lesson dbLesson = entityManager.find(Lesson.class, lessonid);
        if (dbLesson == null) {
            System.out.println("Something went wrong while updating lesson in Database! Please try again later...");
            return;
        }

        for (InstructorLesson instructorLesson : dbLesson.getInstructorLessonList()) {
            instructorLesson.getInstructorId().getLessons().remove(instructorLesson);
            entityManager.persist(instructorLesson.getInstructorId());
            entityManager.remove(instructorLesson);
        }
        dbLesson.getInstructorLessonList().removeAll(dbLesson.getInstructorLessonList());

        InstructorLesson instructorLesson = new InstructorLesson(newLessonCount, dbLesson, newInstructor);
        dbLesson.getInstructorLessonList().add(0, instructorLesson);
        newInstructor.getLessons().add(instructorLesson);

        entityManager.persist(instructorLesson);
        entityManager.persist(newInstructor);
        entityManager.persist(dbLesson);
        entityManager.getTransaction().commit();
    }

    public static ArrayList<Student> findStudentsByName(String name) {
//        Person person = entityManager.createNamedQuery("Person.findByFirstName", Person.class)
//                .setParameter("firstName", name).getResultList().get(0);

        Pattern pattern = Pattern.compile(name);
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : personRepository.findAllStudents()) {
            Matcher matcher = pattern.matcher(student.toString());
            if (matcher.find()) {
                result.add(student);
            }
        }
        return result;
    }

    public static ArrayList<Person> findPersonByName(String name) {

        Pattern pattern = Pattern.compile(name);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : personRepository.findAll()) {
            Matcher matcher = pattern.matcher(person.toString());
            if (matcher.find()) {
                result.add(person);
            }
        }
        return result;
    }

    public static List<Lesson> findAllLessons() {
        return entityManager.createNamedQuery("Lesson.findAll", Lesson.class).getResultList();
    }

    public static List<StudentClass> findAllClasses() {
        return entityManager.createNamedQuery("StudentClass.findAll", StudentClass.class).getResultList();
    }

    public static Person findPersonById(int id) {
        Person person = personRepository.findById(id).get();
        return person;
    }

    public static Lesson findLessonByName(String lessonName) {
        Lesson result = entityManager.createNamedQuery("Lesson.findByName", Lesson.class)
                .setParameter("name", lessonName).getResultList().get(0);

        return result;
    }

    public static Lesson findLessonByID(int lessonId) {
        Lesson result = entityManager.createNamedQuery("Lesson.findById", Lesson.class)
                .setParameter("id", lessonId).getResultList().get(0);

        return result;
    }

    public static void addTopicToLesson(Lesson lesson, int week, String topicName) {
        entityManager.getTransaction().begin();
        Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());

        LessonTopic topic = new LessonTopic(week, topicName, dbLesson);
        dbLesson.getLessonTopicList().add(topic);
        lesson.getLessonTopicList().add(topic);

        entityManager.persist(topic);
        entityManager.persist(dbLesson);
        entityManager.getTransaction().commit();

    }

    public static void updateTopicToLesson(Lesson lesson, int topicWeek, String newTopic) {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }

        Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());

        LessonTopic selectedTopic = null;
        for (LessonTopic lessonTopic : dbLesson.getLessonTopicList()) {
            if (lessonTopic.getWeek() == topicWeek) {
                lessonTopic.setTopic(newTopic);
                selectedTopic = lessonTopic;
            }
        }

        entityManager.persist(selectedTopic);
        entityManager.persist(dbLesson);
        entityManager.getTransaction().commit();
    }

    public static void deleteTopicFromLesson(Lesson lesson, int topicWeek) {
        entityManager.getTransaction().begin();

        Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());

        LessonTopic selectedTopic = null;
        for (LessonTopic lessonTopic : dbLesson.getLessonTopicList()) {
            if (lessonTopic.getWeek() == topicWeek) {
                selectedTopic = entityManager.find(LessonTopic.class, lessonTopic.getId());
            }
        }

        if (selectedTopic == null) {
            return;
        }
        dbLesson.getLessonTopicList().remove(selectedTopic);
        lesson.getLessonTopicList().remove(selectedTopic);

        entityManager.remove(selectedTopic);
        entityManager.persist(dbLesson);
        entityManager.getTransaction().commit();

        lesson.getLessonTopicList().remove(selectedTopic);
    }

    public static void updateUser(Person user) {
        personRepository.save(user);
    }

    public static void removeUser(Person user) {
        personRepository.deleteById(user.getId());
    }

    public static void removeLessonFromClass(StudentClass sc, Lesson lesson) {
        scr.removeLesson(sc, lesson);
    }

    public static void updateClass(StudentClass studentClass) {
        scr.save(studentClass);
    }

}

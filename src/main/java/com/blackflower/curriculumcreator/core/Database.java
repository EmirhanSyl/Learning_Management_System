package com.blackflower.curriculumcreator.core;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Database {

     // --------------- VARIABLE DECLERATIONS ------------------
    private static final ArrayList<Person> users = new ArrayList<>();
    private static final ArrayList<Class> classes = new ArrayList<>();
    private static final ArrayList<Lesson> lessons = new ArrayList<>();
     // --------------- VARIABLE DECLERATIONS END ------------------
    
     // --------------- ENCAPSULATE FIELDS ------------------
    public static ArrayList<Person> getUsers() { return users; }
    public static ArrayList<Class> getClasses() { return classes; }
    public static ArrayList<Lesson> getLessons() { return lessons; }
     // --------------- ENCAPSULATE FIELDS END ------------------
    
    public static void addClass(String className){
        Class newClass = new Class(className); 
        classes.add(newClass);
    }
    
    public static void removeClass(Class r_class){
        classes.remove(r_class);
    }
    
    public static void addLesson(String lessonName, Instructor instructor, int lessonCount){
        Lesson newLesson = new Lesson(lessonName, instructor, lessonCount);
        instructor.addLesson(newLesson);
        lessons.add(newLesson);
    }
    
    public static void removeLesson(Lesson r_Lesson){
        r_Lesson.getInstructor().getLessons().remove(r_Lesson);
        
        for (Class classe : classes) {
            classe.removeLessonSessions(r_Lesson);
        }
        
        lessons.remove(r_Lesson);
    }
    
    public static void updateLessonData(Lesson lesson, Instructor newInstructor, int newLessonCount){
         if (!lesson.getInstructor().equals(newInstructor)) {
            lesson.setInstructor(newInstructor);
        }
         
         if (lesson.getLessonCount() != newLessonCount) {
            lesson.setLessonCount(newLessonCount);
        }
    }
    
    public static Person findPersonByName(String name){
        Person person = null;
        
        for (Person user : users) {
            if (user.getFirstName().equals(name)) {
                person = user;
            }
        }
        return person;
    }
    
    public static Person findPersonById(int id){
        Person person = null;

        for (Person user : users) {
            if (user.getId() == id) {
                person = user;
            }
        }
        return person;
    }
    
    public static Lesson findLessonByName(String lessonName){
        Lesson result = null;
        
        for (Lesson lesson : lessons) {
            if (lesson.getLessonName().equals(lessonName)) {
                result = lesson;
            }
        }
        return result;
    }
    
    public static void removeUser(Person user){
        if (user instanceof Instructor) {
//            Instructor instructor = (Instructor)user;
//            instructor.getLessons().forEach((lesson) -> {
//                lesson.setInstructor(null);
//            });
            users.remove(user);
            
        }
        else if(user instanceof Student student){
            student.getStudentClass().getStudents().remove(student);
            users.remove(user);
        }
    }
    
    public static Person login(String username, String password){
        Person account = null;
        
        for (Person user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                account = user;
                break;
            }
        }
        
        return account;
    }
    
}

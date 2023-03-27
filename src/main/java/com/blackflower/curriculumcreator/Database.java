package com.blackflower.curriculumcreator;

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
    
    public static Person findPersonByName(String name){
        Person person = null;
        
        for (Person user : users) {
            if (user.getFirstName().equals(name)) {
                person = user;
            }
        }
        return person;
    }
}

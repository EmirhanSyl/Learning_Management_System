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
    
    
}

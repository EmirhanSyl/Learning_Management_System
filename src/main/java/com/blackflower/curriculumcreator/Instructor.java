
package com.blackflower.curriculumcreator;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Instructor extends Person{
    
   private final ArrayList<Lesson> lessons = new ArrayList<>();
    
    public Instructor(String firstName, String lastName){
        super(firstName, lastName, firstName + lastName, lastName + firstName);
    }
    public Instructor(String firstName, String lastName, Lesson lesson){
        super(firstName, lastName, firstName + lastName, lastName + firstName);
        addLesson(lesson);
    }

    public ArrayList<Lesson> getLessons() { return lessons; }
    
    public final void addLesson(Lesson lesson){
        lessons.add(lesson);
    }
}

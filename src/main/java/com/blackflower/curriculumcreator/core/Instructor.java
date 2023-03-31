
package com.blackflower.curriculumcreator.core;

import com.blackflower.curriculumcreator.core.CourseSession;
import com.blackflower.curriculumcreator.core.Class;
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
    
    public ArrayList<Class> lessonsClasses(){
        ArrayList<Class> result = new ArrayList<>();
        
        for (Lesson lesson : lessons) {
            ArrayList<Class> lessonClasses = lesson.lessonClasses();
            
            for (Class lessonClasse : lessonClasses) {
                if (!result.contains(lessonClasse)) {
                    result.add(lessonClasse);
                }
            }
        }
        
        return result;
    }
    
    public void createSession(Lesson lesson, Class sessionClass, int day, 
            int month, int year, int sessionHours){
        
        CourseSession session = new CourseSession(lesson, sessionClass, day, month, year, sessionHours);
        sessionClass.addCourseSession(session);
    }
}


package com.blackflower.curriculumcreator.core;

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
    
    public ArrayList<Class> getResponsibleClasses(){
        ArrayList<Class> result = new ArrayList<>();
        
        for (Lesson lesson : lessons) {
            lesson.lessonClasses().forEach((classe) -> {
                if (!result.contains(classe)) {
                    result.add(classe);
                }
            });
        }
        
        return result;
    }
    
    // Too complex Structure! Will be done better in the future updates...
    public ArrayList<CourseSession> getResponsibleSessions(){
        ArrayList<CourseSession> result = new ArrayList<>();
        
        for (Lesson lesson : lessons) {
            getResponsibleClasses().forEach((classe) -> {
                result.addAll(classe.getLessonSessions(lesson.getLessonName()));
            });
        }
        
        return result;
    }
    
    public ArrayList<CourseSession> getResponsibleSessions(Lesson lesson){
        ArrayList<CourseSession> result = new ArrayList<>();
        
        getResponsibleClasses().forEach((classe) -> {
            result.addAll(classe.getLessonSessions(lesson.getLessonName()));
        });
        return result;
    }
    
    public ArrayList<CourseSession> getResponsibleSessions(Class classe){
        ArrayList<CourseSession> result = new ArrayList<>();
        
        for (Lesson lesson : lessons) {
            result.addAll(classe.getLessonSessions(lesson.getLessonName()));
        }
        
        return result;
    }
    
    public void removeSession(int sessionID){
        
        Class targetClass = null;
        CourseSession targetSession = null;
        for (Class classe : Database.getClasses()) {
            for (CourseSession session : classe.getSessions()) {
                if (session.getID() == sessionID) {
                    targetClass = classe;
                    targetSession = session;
                }
            }
        }
        if (targetClass != null) {
            targetClass.getSessions().remove(targetSession);
        }
    }
    
    
    
}

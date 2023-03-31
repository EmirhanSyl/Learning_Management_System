package com.blackflower.curriculumcreator.core;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Class {


    // --------------- VARIABLE DECLERATIONS ------------------
    private String className;
    private final ArrayList<Student> students = new ArrayList();
    private final ArrayList<Lesson> lessons = new ArrayList();
    private final ArrayList<CourseSession> sessions = new ArrayList();
    
    
    // --------------- VARIABLE DECLERATIONS END ------------------

    public Class(String className) {
        this.className = className;
    }
    
     // --------------- ENCAPSULATE FIELDS ------------------
    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public ArrayList<Student> getStudents() { return students; }
    public ArrayList<Lesson> getLessons() { return lessons; }
    public ArrayList<CourseSession> getSessions() { return sessions; }
    
     // --------------- ENCAPSULATE FIELDS END ------------------

    public void addStudent(Student student){
        students.add(student);
    }
    
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void removeStudent(String username){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUserName().equals(username)) {
                students.remove(i);
                break;
            }
        }
    }
    
    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }
    
    public void removeLesson(Lesson lesson){
        for (int i = 0; i < sessions.size(); i++) {
            if (sessions.get(i).getLesson().equals(lesson)) {
                sessions.remove(i);
            }
        }
        lessons.remove(lesson);
    }
    public void removeAllLesson(){
        sessions.clear();
        lessons.clear();
    }
            
    
    public ArrayList<CourseSession> getLessonSessions(String lessonName){
        ArrayList<CourseSession> result = new ArrayList<>();
        
        for (CourseSession session : sessions) {
            if (session.getLesson().getLessonName().equals(lessonName)) {
                result.add(session);
            }
        }
        
        return result;
    }
    
    public void removeLessonSessions(Lesson lesson){
        for (int i = 0; i < sessions.size(); i++) {
            if (sessions.get(i).getLesson().equals(lesson)) {
                sessions.remove(i);
            }
        }
    }
    
    public int remainedSessions(Lesson lesson){
        int remainedSessions = lesson.getLessonCount();
        for (CourseSession session : sessions) {
            if (session.getSessionClass().equals(this)) {
                remainedSessions -= session.getSessionHours();
            }
        }
        return remainedSessions;
    }
    
    public void addCourseSession(CourseSession session){
        sessions.add(session);
    }
    
    @Override
    public String toString() {
        return className;
    }
    
    
    
}

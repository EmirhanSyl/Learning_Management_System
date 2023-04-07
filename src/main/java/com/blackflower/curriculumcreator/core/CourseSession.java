package com.blackflower.curriculumcreator.core;

import com.blackflower.curriculumcreator.core.Class;

/**
 *
 * @author emirs
 */
public class CourseSession {

    // --------------- VARIABLE DECLERATIONS ------------------
    private static int sessionCount = 10000;
    private final int id;
    
    private Lesson lesson;
    private Class sessionClass;
    
    private int day;
    private int month;
    private int year;
    
    private int sessionHours;
    // --------------- VARIABLE DECLERATIONS END------------------

    public CourseSession(Lesson lesson, Class sessionClass, int day, int month, int year, int sessionHours) {
        id = sessionCount;
        this.lesson = lesson;
        this.sessionClass = sessionClass;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sessionHours = sessionHours;
        
        sessionCount++;
    }

     // --------------- ENCAPSULATE FIELDS ------------------
    public int getID() { return id; }
    
    public Lesson getLesson() { return lesson; }
    public void setLesson(Lesson lesson) { this.lesson = lesson; }

    public Class getSessionClass() { return sessionClass; }
    public void setSessionClass(Class sessionClass) { this.sessionClass = sessionClass; }

    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getSessionHours() { return sessionHours; }
    public void setSessionHours(int sessionHours) { this.sessionHours = sessionHours; }
     // --------------- ENCAPSULATE FIELDS END ------------------
    
    public String getDate(){
        return day + "." + month + "." + year;
    }
}

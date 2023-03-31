package com.blackflower.curriculumcreator.core;

/**
 *
 * @author emirs
 */
public class Admin extends Person{
    
    
    
    public Admin(String firstName, String lastName, String userName, String password){
        super(firstName, lastName, userName, password);
    }
    
    public void addStudent(String firstName, String lastName, Class studentClass){
        Student student = new Student(firstName, lastName);
        studentClass.addStudent(student);
        student.setStudentClass(studentClass);
        Database.getUsers().add(student);
    }
    
    public void addInstructor(String firstName, String lastName, Lesson lesson){
        Instructor instructor = new Instructor(firstName, lastName, lesson);
        lesson.setInstructor(instructor);
        Database.getUsers().add(instructor);
    }
}

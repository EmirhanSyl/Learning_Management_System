package com.blackflower.curriculumcreator;

/**
 *
 * @author emirs
 */
public class Admin extends Person{
    
    
    
    public Admin(String firstName, String lastName, String userName, String password){
        super(firstName, lastName, userName, password);
    }
    
    public void addStudent(String firstName, String lastName){
        Student student = new Student(firstName, lastName);
    }
    
    public void addInstructor(String firstName, String lastName){
        Instructor instructor = new Instructor(firstName, lastName);
    }
}

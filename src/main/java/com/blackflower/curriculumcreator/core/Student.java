package com.blackflower.curriculumcreator.core;

import com.blackflower.curriculumcreator.core.Person;
import com.blackflower.curriculumcreator.core.Class;

/**
 *
 * @author emirs
 */
public class Student extends Person{

     // --------------- VARIABLE DECLERATIONS ------------------
    private Class studentClass;
     // --------------- VARIABLE DECLERATIONS END ------------------
    
    
    public Student(String firstName, String lastName){
        super(firstName, lastName, firstName + lastName, lastName + firstName);
    }

     // --------------- ENCAPSULATE FIELDS ------------------
    public Class getStudentClass() { return studentClass; }
    public void setStudentClass(Class studentClass) { this.studentClass = studentClass; }
     // --------------- ENCAPSULATE FIELDS ------------------
    
    public void changeStudentClass(Class newClass){
        studentClass.getStudents().remove(this);
        newClass.getStudents().add(this);
        studentClass = newClass;
    }
    
}

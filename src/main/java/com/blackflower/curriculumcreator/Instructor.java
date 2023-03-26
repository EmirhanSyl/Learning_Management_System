
package com.blackflower.curriculumcreator;

/**
 *
 * @author emirs
 */
public class Instructor extends Person{
    
    
    
    public Instructor(String firstName, String lastName){
        super(firstName, lastName, firstName + lastName, lastName + firstName);
    }
}

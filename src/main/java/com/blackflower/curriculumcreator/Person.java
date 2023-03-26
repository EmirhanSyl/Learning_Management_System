package com.blackflower.curriculumcreator;

/**
 *
 * @author emirs
 */
public class Person {
    
    // --------------- VARIABLE DECLERATIONS ------------------
    private static int personCount = 0;
    private final int id;
    
    private final String firstName;
    private final String lastName;
    private String userName;
    private String password;
    
    public Person(String firstName, String lastName, String userName, String password){
        this.id = personCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        
        personCount++;
    }
    
    // --------------- ENCAPSULATE FIELDS ------------------
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    
}


package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.repository.PersonRepository;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 *
 * @author emirs
 */
@Entity
@DiscriminatorValue("Student")
public class Student extends Person{

    @ManyToOne
    @JoinTable(
        name = "Student_Class",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "class_id")
    )
    private StudentClass studentClass;

    public Student() {
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public Student(StudentClass studentClass, String firstName, String lastName, String username, String password, String imagePath) {
        super(firstName, lastName, username, password, imagePath);
        this.studentClass = studentClass;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.getId()!= null ? super.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((super.getId() == null && other.getId() != null) || (super.getId() != null && !super.getId().equals(other.getId() ))) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }

}
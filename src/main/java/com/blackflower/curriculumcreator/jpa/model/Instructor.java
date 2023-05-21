package com.blackflower.curriculumcreator.jpa.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author emirs
 */
@Entity
@DiscriminatorValue("Instructor")
public class Instructor extends Person {
    @OneToMany(mappedBy = "instructorId", fetch = FetchType.EAGER)
    private List<InstructorLesson> LessonList;

    public Instructor() {
    }

    public Instructor(String firstName, String lastName, String username, String password, String imagePath) {
        super(firstName, lastName, username, password, imagePath);
    }
    
    

    public Instructor(List<InstructorLesson> LessonList, String firstName, String lastName, String username, String password, String imagePath) {
        super(firstName, lastName, username, password, imagePath);
        this.LessonList = LessonList;
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

    public List<InstructorLesson> getLessons() {
        return LessonList;
    }

    public void setLessons(List<InstructorLesson> lessons) {
        this.LessonList = lessons;
    }

}

package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.repository.LessonRepository;
import com.blackflower.curriculumcreator.jpa.repository.PersonRepository;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Person {

    public Admin() {
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
    
    
    //------------------------------------ FUNCTIONS START -----------------------------------
    public void addStudent(String firstName, String lastName, StudentClass studentClass){
        String imagePath = "C:\\Users\\emirs\\Desktop\\pics\\user.png";
        String username = firstName + lastName;
        String password = "123";
        Student student = new Student(studentClass, firstName, lastName, username, password, imagePath);
        student.setStudentClass(studentClass);
        
        PersonRepository personRepository = new PersonRepository("LMS_PE");
        personRepository.save(student);
    }
    
    public void addInstructor(String firstName, String lastName, Lesson lesson){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        
        String imagePath = "C:\\Users\\emirs\\Desktop\\pics\\user.png";
        String username = firstName + lastName;
        String password = "123";
        Instructor instructor = new Instructor(firstName, lastName, username, password, imagePath);
        Lesson dbLesson = entityManager.find(Lesson.class, lesson.getId());
        
        InstructorLesson instructorLesson = new InstructorLesson(0, dbLesson, instructor);
        ArrayList<InstructorLesson> instructorLessons = new ArrayList<>();
        instructorLessons.add(instructorLesson);
        
        instructor.setLessons(instructorLessons);
        lesson.getInstructorLessonList().add(instructorLesson);
        
        entityManager.persist(instructorLesson);
        entityManager.persist(instructor);
        entityManager.merge(lesson);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        emf.close();
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }

}

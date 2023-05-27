
package com.blackflower.curriculumcreator.jpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author emirs
 */
@Entity
@Table(name = "LESSON")
@NamedQueries({
    @NamedQuery(name = "Lesson.findAll", query = "SELECT l FROM Lesson l"),
    @NamedQuery(name = "Lesson.findById", query = "SELECT l FROM Lesson l WHERE l.id = :id"),
    @NamedQuery(name = "Lesson.findByName", query = "SELECT l FROM Lesson l WHERE l.name = :name")})
public class Lesson implements Serializable {

    @OneToMany(mappedBy = "lessonId")
    private List<CourseSession> coursesessionList;

    @OneToMany(mappedBy = "lessonId", cascade = CascadeType.PERSIST)
    private List<LessonTopic> lessonTopicList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "lessonId", fetch = FetchType.EAGER)
    private List<InstructorLesson> instructorLessonList;
    
    @ManyToMany(mappedBy = "lessons", fetch = FetchType.EAGER)
    private List<StudentClass> studentClasses;
    

    public Lesson() {
    }

    public Lesson(Integer id) {
        this.id = id;
    }

    public Lesson(String name) {
        this.name = name;
    }
    
    public Lesson(String name, List<InstructorLesson> instructorLessonList) {
        this.name = name;
        this.instructorLessonList = instructorLessonList;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InstructorLesson> getInstructorLessonList() {
        return instructorLessonList;
    }

    public void setInstructorLessonList(List<InstructorLesson> instructorLessonList) {
        this.instructorLessonList = instructorLessonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lesson)) {
            return false;
        }
        Lesson other = (Lesson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    public List<LessonTopic> getLessonTopicList() {
        return lessonTopicList;
    }

    public void setLessonTopicList(List<LessonTopic> lessonTopicList) {
        this.lessonTopicList = lessonTopicList;
    }

    public List<CourseSession> getCoursesessionList() {
        return coursesessionList;
    }

    public void setCoursesessionList(List<CourseSession> coursesessionList) {
        this.coursesessionList = coursesessionList;
    }

    public List<StudentClass> getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(List<StudentClass> studentClasses) {
        this.studentClasses = studentClasses;
    }

}

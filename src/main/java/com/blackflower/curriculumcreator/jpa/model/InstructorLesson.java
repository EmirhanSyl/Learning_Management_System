
package com.blackflower.curriculumcreator.jpa.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author emirs
 */
@Entity
@Table(name = "INSTRUCTOR_LESSON")
@NamedQueries({
    @NamedQuery(name = "InstructorLesson.findAll", query = "SELECT \u0131 FROM InstructorLesson \u0131"),
    @NamedQuery(name = "InstructorLesson.findById", query = "SELECT \u0131 FROM InstructorLesson \u0131 WHERE \u0131.id = :id"),
    @NamedQuery(name = "InstructorLesson.findByLessonCount", query = "SELECT \u0131 FROM InstructorLesson \u0131 WHERE \u0131.lessonCount = :lessonCount")})
public class InstructorLesson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LESSON_COUNT")
    private Integer lessonCount;
    @JoinColumn(name = "LESSON_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Lesson lessonId;
    @JoinColumn(name = "INSTRUCTOR_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Instructor instructorId;

    public InstructorLesson() {
    }

    public InstructorLesson(Integer id) {
        this.id = id;
    }

    public InstructorLesson(Integer lessonCount, Lesson lessonId, Instructor instructorId) {
        this.lessonCount = lessonCount;
        this.lessonId = lessonId;
        this.instructorId = instructorId;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonCount() {
        return lessonCount;
    }

    public void setLessonCount(Integer lessonCount) {
        this.lessonCount = lessonCount;
    }

    public Lesson getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lesson lessonId) {
        this.lessonId = lessonId;
    }

    public Instructor getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Instructor instructorId) {
        this.instructorId = instructorId;
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
        if (!(object instanceof InstructorLesson)) {
            return false;
        }
        InstructorLesson other = (InstructorLesson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Instructor: " + instructorId.toString() + " Lesson: " + lessonId.toString() + " Lesson Count: " + lessonCount;
    }

}

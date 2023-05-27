
package com.blackflower.curriculumcreator.jpa.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author emirs
 */
@Entity
@Table(name = "COURSESESSION")
@NamedQueries({
    @NamedQuery(name = "CourseSession.findAll", query = "SELECT c FROM CourseSession c"),
    @NamedQuery(name = "CourseSession.findById", query = "SELECT c FROM CourseSession c WHERE c.id = :id"),
    @NamedQuery(name = "CourseSession.findByStartDate", query = "SELECT c FROM CourseSession c WHERE c.startDate = :startDate"),
    @NamedQuery(name = "CourseSession.findBySessionLength", query = "SELECT c FROM CourseSession c WHERE c.sessionLength = :sessionLength")})
public class CourseSession implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "SESSION_LENGTH")
    private Integer sessionLength;
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "ID")
    @ManyToOne
    private StudentClass classId;
    @JoinColumn(name = "LESSON_ID", referencedColumnName = "ID")
    @ManyToOne
    private Lesson lessonId;

    public CourseSession() {
    }

    public CourseSession(Integer id) {
        this.id = id;
    }

    public CourseSession(Date startDate, Integer sessionLength, StudentClass classId, Lesson lessonId) {
        this.startDate = startDate;
        this.sessionLength = sessionLength;
        this.classId = classId;
        this.lessonId = lessonId;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public StudentClass getClassId() {
        return classId;
    }

    public void setClassId(StudentClass classId) {
        this.classId = classId;
    }

    public Lesson getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lesson lessonId) {
        this.lessonId = lessonId;
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
        if (!(object instanceof CourseSession)) {
            return false;
        }
        CourseSession other = (CourseSession) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lesson: " + lessonId.toString() + " Class: " + classId.toString() + " Session Length: " + sessionLength + " Session date: " + startDate.toString();
    }

}

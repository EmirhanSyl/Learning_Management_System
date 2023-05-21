
package com.blackflower.curriculumcreator.jpa.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author emirs
 */
@Entity
@Table(name = "LESSON_TOPIC")
@NamedQueries({
    @NamedQuery(name = "LessonTopic.findAll", query = "SELECT l FROM LessonTopic l"),
    @NamedQuery(name = "LessonTopic.findById", query = "SELECT l FROM LessonTopic l WHERE l.id = :id"),
    @NamedQuery(name = "LessonTopic.findByWeek", query = "SELECT l FROM LessonTopic l WHERE l.week = :week")})
public class LessonTopic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "WEEK")
    private Integer week;
    @Lob
    @Column(name = "TOPIC")
    private String topic;
    @JoinColumn(name = "LESSON_ID", referencedColumnName = "ID")
    @ManyToOne
    private Lesson lessonId;

    public LessonTopic() {
    }

    public LessonTopic(Integer id) {
        this.id = id;
    }

    public LessonTopic(Integer week, String topic, Lesson lessonId) {
        this.week = week;
        this.topic = topic;
        this.lessonId = lessonId;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
        if (!(object instanceof LessonTopic)) {
            return false;
        }
        LessonTopic other = (LessonTopic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lesson: " + lessonId.toString() + " Week: " + week + " Topic: " + topic;
    }

}


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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "CLASS")
@NamedQueries({
    @NamedQuery(name = "StudentClass.findAll", query = "SELECT s FROM StudentClass s"),
    @NamedQuery(name = "StudentClass.findById", query = "SELECT s FROM StudentClass s WHERE s.id = :id"),
    @NamedQuery(name = "StudentClass.findByName", query = "SELECT s FROM StudentClass s WHERE s.name = :name")})
public class StudentClass implements Serializable {

    @OneToMany(mappedBy = "classId")
    private List<CourseSession> coursesessionList;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "Lesson_CLass",
            joinColumns = {@JoinColumn(name = "class_id")},
            inverseJoinColumns = {@JoinColumn(name = "lesson_id")}
    )
    private List<Lesson> lessons;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;

    public StudentClass() {
    }

    public StudentClass(Integer id) {
        this.id = id;
    }

    public StudentClass(String name) {
        this.name = name;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentClass)) {
            return false;
        }
        StudentClass other = (StudentClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }

    public List<CourseSession> getCoursesessionList() {
        return coursesessionList;
    }

    public void setCoursesessionList(List<CourseSession> coursesessionList) {
        this.coursesessionList = coursesessionList;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    
    

}

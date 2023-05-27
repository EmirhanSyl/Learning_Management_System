package com.blackflower.curriculumcreator.jpa.model;

import com.blackflower.curriculumcreator.jpa.repository.LessonRepository;
import com.blackflower.curriculumcreator.jpa.repository.PersonRepository;
import com.blackflower.curriculumcreator.jpa.repository.StudentClassRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
@Entity
@DiscriminatorValue("Instructor")
public class Instructor extends Person {

    @OneToMany(mappedBy = "instructorId", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
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
        hash += (super.getId() != null ? super.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((super.getId() == null && other.getId() != null) || (super.getId() != null && !super.getId().equals(other.getId()))) {
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

    //---------------------------- FUNCTIONS START -----------------------------
    public final void addLesson(Lesson lesson, int lessonCount) {
        InstructorLesson instructorLesson = new InstructorLesson(lessonCount, lesson, this);
        lesson.getInstructorLessonList().add(instructorLesson);
        this.LessonList.add(instructorLesson);

        LessonRepository lessonRepository = new LessonRepository("LMS_PE");
        lessonRepository.save(lesson);
        PersonRepository personRepository = new PersonRepository("LMS_PE");
        personRepository.save(this);
    }

    public ArrayList<StudentClass> lessonsClasses(Instructor instructor) {
        ArrayList<StudentClass> result = new ArrayList<>();

        ArrayList<Lesson> lessons = new ArrayList<>();
        instructor.LessonList.forEach((instructorLesson) -> {
            lessons.add(instructorLesson.getLessonId());
        });

        for (Lesson lesson : lessons) {
            List<StudentClass> lessonClasses = lesson.getStudentClasses();
            for (StudentClass sutdentClass : lessonClasses) {
                if (!result.contains(sutdentClass)) {
                    result.add(sutdentClass);
                }
            }
        }

        return result;
    }

    public void removeSession(int sessionID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS_PE");
        EntityManager entityManager = emf.createEntityManager();

        CourseSession courseSession = entityManager.find(CourseSession.class, sessionID);

        if (courseSession != null) {
            courseSession.getClassId().getCoursesessionList().remove(courseSession);
            courseSession.getLessonId().getCoursesessionList().remove(courseSession);

            entityManager.getTransaction().begin();
            entityManager.remove(courseSession);
            entityManager.getTransaction().commit();
            entityManager.close();
            emf.close();
        } else {
            entityManager.close();
            emf.close();
        }
    }

    public ArrayList<CourseSession> getResponsibleSessions(Instructor instructor) {
        ArrayList<CourseSession> responsibleSessions = new ArrayList<>();

        for (InstructorLesson instructorLesson : instructor.getLessons()) {

            instructorLesson.getLessonId().getCoursesessionList().forEach((courseSession) -> {
                responsibleSessions.add(courseSession);
            });
        }

        return responsibleSessions;
    }

    public ArrayList<CourseSession> getResponsibleSessions(Instructor instructor, Lesson lesson) {
        ArrayList<CourseSession> responsibleSessions = new ArrayList<>();

        lesson.getCoursesessionList().forEach((courseSession) -> {
            responsibleSessions.add(courseSession);
        });

        return responsibleSessions;
    }

    public ArrayList<CourseSession> getResponsibleSessions(Instructor instructor, StudentClass sc) {
        ArrayList<CourseSession> responsibleSessions = new ArrayList<>();

        sc.getCoursesessionList().forEach((courseSession) -> {
            responsibleSessions.add(courseSession);
        });

        return responsibleSessions;
    }

}

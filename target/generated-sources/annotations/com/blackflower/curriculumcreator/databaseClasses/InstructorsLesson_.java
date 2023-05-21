package com.blackflower.curriculumcreator.databaseClasses;

import com.blackflower.curriculumcreator.databaseClasses.Instructor;
import com.blackflower.curriculumcreator.databaseClasses.Lesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T01:34:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(InstructorsLesson.class)
public class InstructorsLesson_ { 

    public static volatile SingularAttribute<InstructorsLesson, Integer> lessonCount;
    public static volatile SingularAttribute<InstructorsLesson, Instructor> instructor;
    public static volatile SingularAttribute<InstructorsLesson, Lesson> lesson;
    public static volatile SingularAttribute<InstructorsLesson, Integer> instLessonID;

}
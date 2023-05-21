package com.blackflower.curriculumcreator.databaseClasses;

import com.blackflower.curriculumcreator.databaseClasses.Instructor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T01:34:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Lesson.class)
public class Lesson_ { 

    public static volatile SingularAttribute<Lesson, Integer> lessonId;
    public static volatile SingularAttribute<Lesson, String> lessonName;
    public static volatile ListAttribute<Lesson, Instructor> instructors;

}
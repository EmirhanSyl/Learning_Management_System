package com.blackflower.curriculumcreator.databaseClasses;

import com.blackflower.curriculumcreator.databaseClasses.Lesson;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T01:34:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Instructor.class)
public class Instructor_ extends Person_ {

    public static volatile ListAttribute<Instructor, Lesson> lessons;

}
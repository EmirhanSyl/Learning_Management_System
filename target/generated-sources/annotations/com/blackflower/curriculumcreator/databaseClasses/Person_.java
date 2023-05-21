package com.blackflower.curriculumcreator.databaseClasses;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T01:34:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> firstName;
    public static volatile SingularAttribute<Person, String> lastName;
    public static volatile SingularAttribute<Person, String> password;
    public static volatile SingularAttribute<Person, String> imagePath;
    public static volatile SingularAttribute<Person, Integer> personId;
    public static volatile SingularAttribute<Person, Integer> type;
    public static volatile SingularAttribute<Person, String> username;

}
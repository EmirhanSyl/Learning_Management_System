# Learning Management System
 This project was developed for Computer Programming - II using Java Swing

## School Management System

>### Important Note!
>This is the last version of the Learning Management System. It's connecting to the database via JPA(Java Persistence API). So all required classes like 'User' are entities. If you don't need a database connection, check out this old commit that hasn't connection scripts:
https://github.com/EmirhanSyl/Learning_Management_System/tree/6f63eb14662419384e18c48fdfd3b0e8d2327ebf

#### Aim of The Project and Requirements 	
![image](https://github.com/EmirhanSyl/Learning_Management_System/assets/61618968/e72cd8b0-f2a7-43b9-86de-d2134aae0736)
![image](https://github.com/EmirhanSyl/Learning_Management_System/assets/61618968/cddfa69f-82e9-4ce5-ae93-1fe43822204b)


This project aims to develop a School Management System that can be used to automate the school's management.
##### Requirements:
Database(JDBC, Mysql vb.)
Database Driver
Database Tables (Tables and relations shown below)
Additionally, CustomCumponent Package provides custom swing components such as JButton, JTable, and JLabel to have a more aesthetic appearance. 

### Program 	Objects and Relationships


2.1) The main purpose of use of object ‘Person’:
- The admin object, Instructor objects and Student objects are subclasses of the Person object.
- Polymorphism and inheritance are also used in object-oriented concepts thanks to the Person object. common parameters gathered together in this class.

2.2) The main purpose of use of object Admin
- Represents the Admin account. 
- Admin can add & delete new classes.
- Can query all information about School.
- Add & Remove students from classes.
- Add & Drop lessons to classes.
- Delete or Add student and Instructor accounts.
- Add & Delete & Update lesson information.

2.3) The main purpose of use of object Instructor:
- Represents the Instructor's account.
- Display responsible class students.
- Add & Remove lesson sessions.
- Add & Delete & Query Lesson topic.
- Create a Curriculum for responsible lessons.

2.4) The main purpose of use of object Students:
- Represents the Student account.
- Display class details.
- Display lesson sessions
- Display lesson topics.
- Download sessions

2.5) The main purpose of use of object StudentClass:
- Represents a student class
- Has many methods about the class such as removeLessonSessions() or remainedSessions()

2.6) The main purpose of using of object Database:
- Acts as a controller between database and application.
- All database duties happen in this class functions such as Create, Read, Update, and Delete.

2.7) The main purpose of use of object IPage:
- It is an interface designed to notify the system that the panel has changed while making changes to the page. Thanks to this interface, the system is informed when a new panel is opened. This interface works like an event.

2.8) The main purpose of use of object CourseSession:
- Represents the student lesson sessions
- Connects student, instructor, class and lesson objects
2.9) The main purpose of use of object Lesson:
- Represents the School Lessons.
- Has many methods about the class such as lessonClasses or findTopic.

  ### 3. Rules:
     Initially, 1 admin, 2 instructors and 2 student accounts are defined in the system by default. 

##### Login & Register
The terms and conditions must be accepted while creating a new account, otherwise, it will not be possible to register in the system.
A warning is received if all the fields in the register screen are not filled.
A username creating by the system automatically combining name and surname each other in lowercase (ex. Firstname MiddleName Lastname => firstnamemiddlenamelastname, passwords => 123) 
If two students' names and surnames are the same, their usernames will take a suffix (ex. namesurname0, namesurname1)
While creating a new account admin must append a class to a new student.
While creating a new account admin can append a lesson to a new instructor.
If an instructor account is created with a lesson, the lesson’s information will be updated.
If the ‘remember me’ option is checked, the System won't ask for login information until logged out.

##### ADMİN
If a lesson object is deleted by the admin, this lesson will be dropped from all classes.
If a lesson object is deleted by the admin, all sessions from this lesson will be deleted.
If the admin wants to remove a class, all students in classes will be carried to other classes first.
If a class object is deleted by the admin, all sessions from this class will be deleted
While updating selected lessons, the admin can change the lesson count per week.



##### INSTRUCTOR
While adding new lesson sessions, the instructor can select session hours according to the admin’s selected lesson hours limit per week.
The instructor cannot add more than a specified amount of hours of session
Instructors and students can query the lesson topics by searching a string from the topic.
And project includes more and more specific rules.

  ### 4. UML DIAGRAM
  ![image](https://github.com/EmirhanSyl/Learning_Management_System/assets/61618968/a894b9e8-ee88-4f26-baf5-171588fccada)

  ### 5. DATABASE MODEL DIAGRAM
  ![image](https://github.com/EmirhanSyl/Learning_Management_System/assets/61618968/59f3b78d-466e-4b30-9bab-3cde70066c92)

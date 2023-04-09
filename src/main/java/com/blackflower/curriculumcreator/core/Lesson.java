
package com.blackflower.curriculumcreator.core;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emirs
 */
public class Lesson {

    // --------------- VARIABLE DECLERATIONS ------------------
    private String lessonName;
    private final String[] topics = new String[14];
    private Instructor instructor;
    private int lessonCount;

    public Lesson(String lessonName, Instructor instructor, int lessonCount) {
        this.lessonName = lessonName;
        this.instructor = instructor;
        this.lessonCount = lessonCount;
        
        for (int i = 0; i < topics.length; i++) {
            topics[i] = "";
        }
    }
    
    // --------------- VARIABLE DECLERATIONS END ------------------
    
     // --------------- ENCAPSULATE FIELDS ------------------
    public String getLessonName() { return lessonName; }
    public void setLessonName(String lessonName) { this.lessonName = lessonName; }
    
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    
    public int getLessonCount(){ return lessonCount; }
    public void setLessonCount(int lessonCount){ this.lessonCount = lessonCount; }
    
    public String[] getTopics() { return topics; }
    
     // --------------- ENCAPSULATE FIELDS END ------------------
    
    
    public void addTopic(String topicName, int topicIndex){
        topics[topicIndex] = topicName;
    }    
    
    public void removeTopic(int topicIndex){
        topics[topicIndex] = "";
    }
    
    public ArrayList<Class> lessonClasses(){
        ArrayList<Class> result = new ArrayList<>();
        
        for (Class classe : Database.getClasses()) {
            if (classe.getLessons().contains(this)) {
                result.add(classe);
            }
        }
        return result;
    }

    public ArrayList<String> findTopic(String patternText) {
        ArrayList<String> result = new ArrayList<>();
        
        Pattern pattern = Pattern.compile(patternText);
        for (String topic : topics) {
            Matcher matcher = pattern.matcher(topic);
            if (matcher.find()) {
                result.add(topic);
            }
        }
        
        return result;
    }
    
    public Dictionary<String, String> findTopic(String patternText, int k) {
        Dictionary<String, String> result = new Hashtable<>();
        
        Pattern pattern = Pattern.compile(patternText);
        for (int i = 0; i < topics.length; i++) {
            Matcher matcher = pattern.matcher(topics[i]);
            if (matcher.find()) {
                result.put("Week-" + i, topics[i]);
            }
        }
        
        return result;
    }

    @Override
    public String toString() {
        return getLessonName();
    }

}

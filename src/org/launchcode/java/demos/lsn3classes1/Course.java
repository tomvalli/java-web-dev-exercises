package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseID;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseID, ArrayList<Student> roster) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.roster = roster;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setRoster(ArrayList<Student> roster){
        this.roster = roster;
    }

    public ArrayList<Student> getRoster() {
        return this.roster;
    }
}

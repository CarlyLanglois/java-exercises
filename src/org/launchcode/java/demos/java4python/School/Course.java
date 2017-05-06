package org.launchcode.java.demos.java4python.School;

import java.util.ArrayList;

/**
 * Created by carlylanglois on 5/6/17.
 */
public class Course {

    private static int numberOfCredits = 3;
    private ArrayList<Student> students;
    private String subject;

    //get numberOfCredits
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    //get and set numberOfStudents
    public ArrayList<Student> students() {
        return students;
    }
    public void setStudents(ArrayList<Student> aStudents) {
        students = aStudents;
    }

    //get and set subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        subject = aSubject;
    }
}

package org.launchcode.java.demos.java4python.School;

/**
 * Created by carlylanglois on 5/6/17.
 */
public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //get and set name
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    //get and set studentId
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    //get and set numberOfCredits
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    //get and set gpa
    public double getGpa() {
        return gpa;
    }
    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

}

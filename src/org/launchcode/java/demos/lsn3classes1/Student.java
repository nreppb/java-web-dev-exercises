package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    private void setName(String newName) {
        name = newName;
    } public String getName() {
        return name; }

    private void setStudentId(int newStudentId) {

        studentId = newStudentId;
    } public int getStudentId() {

        return studentId;
    }

    private void setNumberOfCredits(int newNumberOfCredits) {
        numberOfCredits = newNumberOfCredits;
    } public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setGpa(double newGpa) {

        gpa = newGpa;
    } public double getGpa() {

        return gpa;
    }

}
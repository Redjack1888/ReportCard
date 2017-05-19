package com.example.android.reportcard;

/**
 * Created by Alessandro Mana on 19/05/2017.
 * For the grades, going between 1-10, I use Integers
 */

public class ReportCard {

    // Student name
    private String mNameStudent;

    //Course Year
    private int mCourseYear;

    // Grade's subject

    private int mHistory;
    private int mGeography;
    private int mMath;
    private int mProgramming;

    /**
     * The Constructor. Create a new ReportCard object.
     *
     * @param nameStudent      Name of the student
     * @param courseYear       Course year
     * @param historyGrade     History grade
     * @param geographyGrade     Geography grade
     * @param mathGrade    Math grade
     * @param programmingGrade Programming grade
     */

    public ReportCard(String nameStudent, int courseYear, int historyGrade, int geographyGrade, int mathGrade, int programmingGrade) {
        mNameStudent = nameStudent;
        mCourseYear = courseYear;
        mHistory = historyGrade;
        mGeography = geographyGrade;
        mMath = mathGrade;
        mProgramming = programmingGrade;
    }


    public String getNameStudent() {
        // Get the Student's name. @return the current student's name
        return mNameStudent;
    }

    public void setNameStudent(String nameStudent) {
        // Set the Student's name
        mNameStudent = nameStudent;
    }

    public int getCourseYear() {
        // Get the Course year. @return the current course year
        return mCourseYear;
    }

    public void setCourseYear(int courseYear) {
        // Set the Course year
        mCourseYear = courseYear;
    }

    public int getHistoryGrade() {
        // Get the History grade. @return the current History grade
        return mHistory;
    }

    public void setHistoryGrade(int historyGrade) {
        // Set the History grade
        mHistory = historyGrade;
    }


    public int getGeographyGrade() {
        // Get the Geography grade. @return the current Geography grade
        return mGeography;
    }

    public void setGeographyGrade(int geographyGrade) {
        // Set the Geography grade
        mGeography = geographyGrade;
    }

    public int getMathGrade() {
        // Get the Math grade. @return the current Math grade
        return mMath;
    }

    public void setMathGrade(int mathGrade) {
        // Set the Math grade
        mMath = mathGrade;
    }

    public int getProgrammingGrade() {
        // Get the Programming grade. @return the current Programming grade
        return mProgramming;
    }

    public void setProgrammingGrade(int programmingGrade) {
        // Set the Programming grade
        mProgramming = programmingGrade;
    }


    public String toString() {
        //Return a representation of the report card
        return "Student's Name: " + mNameStudent + "\n" +
                "Course Year: " + mCourseYear + "\n" +
                "History: " + mHistory + "\n" +
                "Geography: " + mGeography + "\n" +
                "Math: " + mMath + "\n" +
                "Programming: " + mProgramming;

    }
}
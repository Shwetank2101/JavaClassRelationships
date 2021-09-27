package com.College;

public class LabCourse extends CollegeCourse{

    private final int labFee=50;
    private int labCourseFee;

    public LabCourse(String department, int CourseNo, int credits) {
        super(department, CourseNo, credits);
        labCourseFee=super.getCourseFee()+labFee;
    }

    public int getlabCourseFee() {
        return labCourseFee;
    }

    public void display() {
        System.out.println("Department: "+ super.getDepartment());
        System.out.println("Course Number: "+super.getCourseNo());
        System.out.println("Credit hours: "+super.getCredits());
        System.out.println("Course Fee: "+super.getCourseFee());
    }

}

package com.endproject.lopputyo;

public class Course {
    private static int CourseidCounter;
    private long courseid;
    private String coursename;
    private String teacher;

    public Course() {
    }

    public Course(long courseid, String coursename, String teacher) {
        this.courseid = CourseidCounter++;
        this.coursename = coursename;
        this.teacher = teacher;
    }

    public long getCourseid() {
        return this.courseid;
    }

    public void setCourseid(long courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Course courseid(long courseid) {
        setCourseid(courseid);
        return this;
    }

    public Course coursename(String coursename) {
        setCoursename(coursename);
        return this;
    }

    public Course teacher(String teacher) {
        setTeacher(teacher);
        return this;
    }

 //   public Course address(String address){
        
 //       return
 //   }
}

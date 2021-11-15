package com.endproject.lopputyo;

public class LocalCourse extends Course {
    
    private String luokkatila;

   
   
    public LocalCourse(String luokkatila) {
        this.luokkatila = luokkatila;

    }
    public void setLuokkatila(String luokkatila) {
        this.luokkatila = luokkatila;
    }

    public String getLuokkatila() {
        return this.luokkatila;
    }

    @Override
    public String toString() {
        return "{" +
            getCoursename() + "--" +
            getTeacher() + "--";
    }
}

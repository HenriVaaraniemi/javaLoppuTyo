package com.endproject.lopputyo;

public class OnlineCourse extends Course {
    public String address;

    public OnlineCourse(String address) {
        this.address = address;

    }

    public void setLuokkatila(String address) {
        this.address = address;
    }

    public String getLuokkatila() {
        return this.address;
    }

}

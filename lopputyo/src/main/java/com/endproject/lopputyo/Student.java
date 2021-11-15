package com.endproject.lopputyo;

public class Student {
    private static int idCounter;
    private long studentid;
    private String etunimi;
    private String sukunimi;

    public Student() {
    }

    public Student(long studentid, String etunimi, String sukunimi) {
        this.studentid = idCounter++;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }
// test
    public String getStudents(){
        return this.studentid + this.etunimi + this.sukunimi;
    }

    public long getStudentid() {
        return this.studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public String getEtunimi() {
        return this.etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return this.sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public Student studentid(long studentid) {
        setStudentid(studentid);
        return this;
    }

    public Student etunimi(String etunimi) {
        setEtunimi(etunimi);
        return this;
    }

    public Student sukunimi(String sukunimi) {
        setSukunimi(sukunimi);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " studentid='" + getStudentid() + "'" +
            ", etunimi='" + getEtunimi() + "'" +
            ", sukunimi='" + getSukunimi() + "'" +
            "}";
    }

}

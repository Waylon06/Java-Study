package com.pojo;

public class Student {
    private int sid;
    private String sname;
    private String classes;
    private int spower;
    private String spassword;
    private int back;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", classes='" + classes + '\'' +
                ", spower=" + spower +
                ", spassword='" + spassword + '\'' +
                ", back=" + back +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getSpower() {
        return spower;
    }

    public void setSpower(int spower) {
        this.spower = spower;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public Student() {
    }

    public Student(int sid, String sname, String classes, int spower, String spassword, int back) {
        this.sid = sid;
        this.sname = sname;
        this.classes = classes;
        this.spower = spower;
        this.spassword = spassword;
        this.back = back;
    }
}

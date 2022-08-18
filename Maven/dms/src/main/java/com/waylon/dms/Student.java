package com.waylon.dms;


public class Student {
    private Integer sid;
    private String sname;
    private String classes;
    private Integer spower;
    private String spassword;
    private Integer back;

    public Student() {
    }

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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
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

    public Integer getSpower() {
        return spower;
    }

    public void setSpower(Integer spower) {
        this.spower = spower;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Integer getBack() {
        return back;
    }

    public void setBack(Integer back) {
        this.back = back;
    }

    public Student(Integer sid, String sname, String classes, Integer spower, String spassword, Integer back) {
        this.sid = sid;
        this.sname = sname;
        this.classes = classes;
        this.spower = spower;
        this.spassword = spassword;
        this.back = back;
    }
}

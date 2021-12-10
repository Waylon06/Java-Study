package com.pojo;

public class Building {

    private String building;
    private int floor;
    private int house;
    private int bed;
    private int sid;
    private int live;

    @Override
    public String toString() {
        return "Building{" +
                "building='" + building + '\'' +
                ", floor=" + floor +
                ", house=" + house +
                ", bed=" + bed +
                ", sid=" + sid +
                ", live=" + live +
                '}';
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public Building() {
    }

    public Building(String building, int floor, int house, int bed, int sid, int live) {
        this.building = building;
        this.floor = floor;
        this.house = house;
        this.bed = bed;
        this.sid = sid;
        this.live = live;
    }
}

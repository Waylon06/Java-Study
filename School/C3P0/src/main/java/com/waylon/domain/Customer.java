package com.waylon.domain;

import java.io.Serializable;

public class Customer implements Serializable {
    private String  author;
    private String  bname;
    private int id;
    private int price;
    private int date;
    private String address;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "author='" + author + '\'' +
                ", bname='" + bname + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", date=" + date +
                ", address='" + address + '\'' +
                '}';
    }
}

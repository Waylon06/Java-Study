package com.waylon;


public class Cat {
    private String name;

    public void eat() {
        System.out.println(this.name + "在吃饭");
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("初始化......");
    }

    public void destroy() {
        System.out.println("销毁......");
    }
}

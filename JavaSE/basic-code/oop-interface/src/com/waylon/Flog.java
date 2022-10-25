package com.waylon;

public class Flog extends Animal implements Swim{


    public Flog() {
    }

    public Flog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println(getName() +"会蛙泳");
    }
}

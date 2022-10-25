package com.waylon;

public class Test {
    public static void main(String[] args) {
        Flog flog = new Flog("小青",1);
        System.out.println(flog.getName()+","+flog.getAge());

        flog.eat();
        flog.swim();
    }
}

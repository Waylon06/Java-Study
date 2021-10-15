package emo1;

import emo1.Animal;
import emo1.dog;

public class Test {
    public static void main(String[] args) {
        Animal one=new Animal();
        dog two=new dog();
        one.name="雷宇";
        two.name="阿军";
        System.out.println(one.name+"\n"+two.name);
        one.bark();
        two.run();
    }
}

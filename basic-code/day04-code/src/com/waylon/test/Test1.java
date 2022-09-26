package com.waylon.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while(x != 0) {
            int last = x % 10;
            x = x / 10;
            num = num * 10 + last;
        }
        System.out.println(temp == x);
    }
}

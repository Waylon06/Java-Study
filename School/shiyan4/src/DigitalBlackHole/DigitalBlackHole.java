package DigitalBlackHole;

import java.util.Scanner;

public class DigitalBlackHole {
    public static void main(String[] args) {
        int x;
        int a[] = new int[4];
        System.out.println("请输入一个四位数");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        Rank one =new Rank();
        while (x!=6174){
            a[0] = x/1000;
            a[1] = x/100%10;
            a[2] = x/10%10;
            a[3] = x%10;
            one.rank1(a);
            System.out.println(one.rank1(a));
            one.rank2(a);
            System.out.println(one.rank2(a));
            x=one.rank2(a)-one.rank1(a);
            }
            System.out.println("x的值为："+x);
    }
}

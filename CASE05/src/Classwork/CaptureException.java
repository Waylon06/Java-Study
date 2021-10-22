package Classwork;

import java.util.Scanner;

public class CaptureException {
    public static void main(String[] args) {
        int a,b;
        float S;
        System.out.println("请分别输入a与b的值");
        Scanner A=new Scanner(System.in);
        a=A.nextInt();
        Scanner B=new Scanner(System.in);
        b=B.nextInt();
        S=(float) a/b;
        System.out.println(S);

    }
}

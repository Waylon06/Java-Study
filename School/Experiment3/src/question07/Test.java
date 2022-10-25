package question07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        All al = new All();
        System.out.println("请分别输入长、宽、高的值：");
        Scanner sc = new Scanner(System.in);
        al.chang = sc.nextInt();
        al.width = sc.nextInt();
        al.height = sc.nextInt();
        System.out.println("该长方体的底面积为："+al.square());
        System.out.println("该长方体的体积为："+al.all());
    }
}

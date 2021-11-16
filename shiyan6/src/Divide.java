import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        int a ,b;
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        if (a % 9 == 0){
            b = a /9;
            System.out.println(a+"能被"+b+"个9整除");
        }
        else System.out.println("该数不能被9整除");
    }
}

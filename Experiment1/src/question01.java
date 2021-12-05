import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        int a, b,c=0,i;
        System.out.println("请输入两个正整数");
        Scanner one = new Scanner(System.in);
        a = one.nextInt();
        Scanner two = new Scanner(System.in);
        b = two.nextInt();
        i =a * b;
        while (b!=0){
            c = a%b;
            a = b;
            b = c;
        }
        System.out.println("最大公约数为："+ a);
        if (i>a){
            i =i / a;
        }
        System.out.println("最小公倍数为："+i);
    }
}

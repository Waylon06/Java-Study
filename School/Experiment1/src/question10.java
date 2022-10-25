import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        System.out.println("请输入一个不多于五位数的整数：");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int b ;
        b = a.length();
        char c[] = new char[a.length()];
        c =a.toCharArray();
        System.out.println("此数为："+b+"位");
        for (int i = a.length()-1; i >= 0; i--) {
            System.out.println(c[i]);
        }
    }
}

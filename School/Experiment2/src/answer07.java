import java.util.Scanner;

public class answer07 {
    public static void main(String[] args) {
        String a;
        int b;
        System.out.println("请输入一段字符串：");
        Scanner in = new Scanner(System.in);
        a = in.next();
        b = a.length();
        System.out.println("字符串长度为："+b);
    }
}

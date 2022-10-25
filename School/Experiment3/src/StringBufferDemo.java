import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        String a, b, c;
        System.out.println("请输入三个字符或字符串：");
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        Scanner three = new Scanner(System.in);
        a = one.next();
        b = two.next();
        c = three.next();
        StringBuffer sb = new StringBuffer();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        System.out.println(sb);
    }
}

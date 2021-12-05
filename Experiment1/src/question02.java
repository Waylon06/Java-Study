import java.util.Scanner;

public class question02 {
    public static void main(String[] args) {
        String x ;
        System.out.println("请输入一段字符：");
        Scanner in = new Scanner(System.in);
        x = in.next();
        char[] ch = new char[x.length()];
        ch = x.toCharArray();
        System.out.println("该字符串由"+x.length()+"个字符组成");
        for (int i = 0; i < x.length(); i++) {
            System.out.println(ch[i]);
        }
    }
}

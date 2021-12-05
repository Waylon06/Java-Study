import java.util.Scanner;

public class answer05 {
    public static void main(String[] args) {
        String a;
        System.out.println("请输入一个整数");
        Scanner in = new Scanner(System.in);
        a = in.next();
        char[] b = new char[a.length()];
        b = a.toCharArray();
        for (int i = a.length(); i >= 0; i--) {
            if(i>=4&&i<=7){
                System.out.println(b[i-1]);
            }
        }
    }
}

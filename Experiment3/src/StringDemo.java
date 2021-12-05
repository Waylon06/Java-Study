import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String a, b;
        System.out.println("请输入两个需要进行比较的字符或者字符串");
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        a = one.next();
        b = two.next();
        if (a.equals(b)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

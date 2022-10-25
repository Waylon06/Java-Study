import java.lang.Math;
import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        double a, b;
        System.out.println("请分别输入a和b的值：");
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        a = one.nextDouble();
        b = two.nextDouble();
        System.out.println("最大值四舍五入为：");
        System.out.println(Math.round(Math.max(a,b)));
    }
}

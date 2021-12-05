import java.util.Scanner;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的工资：");
        double i = sc.nextDouble();
        double s = i - 3500;
        double j = 0;
        if (s > 0) {
            if (s <= 1500) {
                j = s * 0.03;
            } else if (s <= 4500) {
                j = 1500 * 0.03 + (s - 1500) * 0.1;
            } else if (s <= 9000) {
                j = 1500 * 0.03 + 3000 * 0.1 + (s - 4500) * 0.2;
            } else if (s <= 35000) {
                j = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (s - 9000) * 0.25;
            } else if (s <= 55000) {
                j = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (s - 35000) * 0.3;
            } else if (s <= 80000) {
                j = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (s - 55000) * 0.35;
            } else {
                j = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (s - 80000) * 0.45;
            }
            System.out.println("你应交的税为：" + j);
        } else {
            System.out.println("不交税！");
        }
    }
}
import java.util.Scanner;

public class answer08 {
    public static void main(String[] args) {
        int num, sum = 0, b, c;
        System.out.println("请输入四位整数的数据：");
        Scanner in = new Scanner(System.in);
        num  = in.nextInt();
        int a[] = new int[4];
        a[0] = num/1000;
        a[1] = num/100%10;
        a[2] = num/10%10;
        a[3] = num%10;
        for (int i = 0; i < 4; i++) {
            a[i]+=5;
            a[i] = a[i] % 10;
        }
        b = a[0];
        a[0] = a[3];
        a[3] = b;
        c = a[1];
        a[1] = a[2];
        a[2] = c;
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
    }
}

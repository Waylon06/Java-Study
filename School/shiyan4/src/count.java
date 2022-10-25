import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int a[] = new int[50];
        a[0] = 2;
        a[1] = 2;
        int x;
        System.out.println("请输入月数：");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        for(int i=2;i<=x;i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println("兔子数为："+a[x-1]);
    }
}

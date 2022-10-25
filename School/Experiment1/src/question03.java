import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        int a,sum = 0;
        System.out.println("请输入几个数相加：");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        int s[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
        int b[] = new int[a];
        for (int i = 1; i <= a; i++) {
            int c = 1;
            for (int j = 0; j <i-1; j++) {
                c *= 10;
            }
            b[i-1] = a*c;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <=i; j++) {
                s[i] += b[j];
            }
            System.out.println("第"+(i+1)+"个值为："+s[i]);
        }
        for (int i = 0; i < a; i++) {
            sum += s[i];
        }
        System.out.println(a+"个数相加等于"+sum);
    }
}

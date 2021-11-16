import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        int i ,j;
        int m;
        int a[] = new int[10];
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 10 ; i++) {
            System.out.println("请输入第"+(i+1)+"个数：");
            a[i] = in.nextInt();
        }
        for(i=0;i<10;i++) {
            for (j = 0; j < 9 - i; j++) {
                if (a[j] > a[j + 1]) {
                    m = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = m;
                }
            }
        }
        for (int k = 0; k < 10; k++) {
            System.out.print(a[k]);
        }
    }
}

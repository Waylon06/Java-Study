import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a;
        float sum = 0;
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        float b[] = new float[a/2];
        if (a%2==0){
            for (int i = 1; i < a/2; i++) {
                b[i-1] =(float) 1/(2*i);
                sum = (float)b[i-1] + sum;
            }
        }
        else{
            for (int i = 1; i <a/2; i++) {
                b[i-1] = (float) 1/(2*i-1);
                sum = (float)b[i-1] + sum;
            }
        }
        System.out.println(sum);
    }
}

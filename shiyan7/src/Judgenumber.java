import java.util.Scanner;

public class Judgenumber {
    public static void main(String[] args) {
        int a ;
        int b[] = new int[5];
        System.out.println("请输入一个五位数：");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b[0] = a/10000;
        b[1] = a/1000%10;
        b[2] = a/100%10;
        b[3] = a/10%10;
        b[4] = a%10;
        if(b[0] == b[4]||b[1] == b[3]||b[3] == b[2]+1&&b[3] == b[2]-1){
            System.out.println(a+"是回文数");
        }
        else System.out.println(a+"不是回文数");
    }
}

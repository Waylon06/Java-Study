import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        float a,b;
        System.out.println("请输入a与b的值");
        Scanner in = new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        if(a==b){
            System.out.println("a与b相等");
        }
        else{
            System.out.println("a与b不相等");
        }
    }
}

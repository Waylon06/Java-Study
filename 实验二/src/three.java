import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        float a,b,c,Max;
        System.out.println("请分别输入a，b，c的值");
        Scanner in = new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        if(a<b){
            Max=b;
            b=a;
            a=Max;
        }
        if(a<c){
            Max=c;
            c=a;
            a=Max;
        }
        if(b<c){
            Max=c;
            c=b;
            b=Max;
        }
        System.out.println("abc从大到小排列为："+a+"\t"+b+"\t"+c);
    }
}

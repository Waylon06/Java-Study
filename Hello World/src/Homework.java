import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        integer();
        xiaoshu();
        character();
        judgment();
    }

    public static void integer(){    //整数型
        int a;
        byte b;
        short c;
        long d;
        System.out.println("请输入a、b、c、d的值");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextByte();
        c=in.nextShort();
        d=in.nextLong();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void xiaoshu() {   //浮点型
        float e;
        double f;
        System.out.println("请输入e、f的值");
        Scanner in=new Scanner(System.in);
        e=in.nextFloat();
        f=in.nextDouble();
        System.out.println(e);
        System.out.println(f);
    }

    public static void character() {   //字符型
        char g;
        System.out.println("请输入g的值");
        Scanner in=new Scanner(System.in);
        g=in.next().charAt(0);
        System.out.println(g);
    }

    public static void judgment() {   //布尔型
        boolean h;
        System.out.println("请输入h的值");
        Scanner in=new Scanner(System.in);
        h=in.nextBoolean();
        System.out.println(h);
    }
}

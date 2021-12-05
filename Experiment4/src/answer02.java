import java.util.Scanner;

public class answer02 {
    public static void main(String[] args) {
        double weight, height,fnumber;
        System.out.println("请输入体重与身高：");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        height = sc.nextDouble();
        fnumber = weight/(height*height);
        if (fnumber<18.5){
            System.out.println("偏廋");
        }
        else if (fnumber>=18.5&&fnumber<20.9){
            System.out.println("苗条");
        }
        else if (fnumber>=20.9&&fnumber<=24.9){
            System.out.println("适中");
        }
        else if (fnumber>24.9){
            System.out.println("偏胖");
        }
    }
}

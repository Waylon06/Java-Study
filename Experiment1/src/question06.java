import java.util.Scanner;

public class question06 {
    public static void main(String[] args) {
        float profit,bonus;
        System.out.println("请输入当月利润：");
        Scanner in = new Scanner(System.in);
        profit = in.nextFloat();
        if (profit<=100000){
            bonus = profit*10/100;
            System.out.println("可领奖金为："+bonus);
        }
        else if (profit>100000&&profit<200000){
            bonus = (float) 100000*10/100+(profit-100000)*75/1000;
            System.out.println("可领奖金为："+bonus);
        }
        else if(profit>=200000&&profit<400000){
            bonus = (float) 100000*10/100+100000*75/1000+(profit-200000)*5/100;
            System.out.println("可领奖金为："+bonus);
        }
        else if (profit>=400000&&profit<600000){
            bonus = (float) 100000*10/100+100000*75/1000+200000*5/100+(profit-400000)*3/100;
            System.out.println("可领奖金为："+bonus);
        }
        else if (profit>=600000&&profit<=1000000){
            bonus = (float) 100000*10/100+100000*75/1000+200000*5/100+200000*3/100+(profit-600000)*15/1000;
            System.out.println("可领奖金为："+bonus);
        }
        else if (profit>1000000){
            bonus = (float) 100000*10/100+100000*75/1000+200000*5/100+200000*3/100+400000*15/1000+(profit-1000000)*1/100;
            System.out.println("可领奖金为："+bonus);
        }
    }
}

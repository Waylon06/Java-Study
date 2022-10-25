import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
//        获取一个随机数
//        范围：0-10

//        1.导包（idea自动生成）
//        2.创建对象
        Random r = new Random();
//        3.生成随机数（在小括号中，书写的是生成随机数的范围，这个范围一定是从开始的，到这个数减一结束
//        口诀：包头不包尾，包左不包右
        int randomNum = r.nextInt(10); // 0 ~ 9
        System.out.println(randomNum);
    }
}
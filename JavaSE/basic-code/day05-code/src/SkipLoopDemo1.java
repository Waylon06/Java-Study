public class SkipLoopDemo1 {
    public static void main(String[] args) {
//        1.跳过某次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
//                结束本次循环，进行下次循环
                continue;
            }
            System.out.println("小虎在吃第"+ i +"个包子");
        }
    }
}

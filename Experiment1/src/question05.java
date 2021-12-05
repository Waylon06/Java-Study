public class question05 {
    public static void main(String[] args) {
        float sum = 0 ,down ;
        for (int i = 1; i < 10; i++) {
            float high = 0 ;
            high = (float)100/(2*i);
            sum += high*2 + 100;
        }
        down = 100/(2*10);
        System.out.println("第10次落地时共经过："+sum+"米");
        System.out.println("第10次反弹多高度为："+down);
    }
}

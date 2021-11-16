import java.util.Scanner;

public class JudgmentDate {
    public static void main(String[] args) {
        int c, f, y, m, d, S = 0;
        int a[] = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};         //闰年
        int b[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};         //非闰年
        System.out.println("请输入年份、月份、日期：");
        Scanner one = new Scanner(System.in);
        y = one.nextInt();
        Scanner two = new Scanner(System.in);
        m = two.nextInt();
        Scanner three = new Scanner(System.in);
        d = three.nextInt();                               //赋值给年份（y）月份（m）日期（d）
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                c = 0;
                if (y % 400 == 0)
                    c = 1;
                else
                    c = 0;
            } else
                c = 1;
        } else
            c = 0;
        if (m > 12 || d > 31 || m > 12 && d > 31) {
            System.out.println("抱歉，您的输入有误");
        } else {
            if (c == 0)
                for (f = 0; f < m - 1; f++)
                    S += b[f];                                      //循环体运算1~m-1月相加的天数 （非闰年）
            else if (c == 1)
                for (f = 0; f < m - 1; f++)
                    S += a[f];                                      //循环体运算1~m-1月相加的天数（闰年）      +
            S = S + d;                                                //加上日期（d）
            System.out.println("这是该年的第"+S+"天");                       //得出输入的年月日为该年的天数
        }
    }
}

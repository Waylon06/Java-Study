import java.util.Scanner;

public class answer01 {
    public static void main(String[] args) {
        String a;
        System.out.println("请输入星期几的英文第一个字母：");
        Scanner in = new Scanner(System.in);
        a = in.next();
        if(a.equals("m")) {
            System.out.println("星期一(Monday)");
        }
        else if(a.equals("t")){
            System.out.println("您输入的字母有两个选项请输入该天的第二个字母：");
            Scanner one = new Scanner(System.in);
            String b = one.next();
            if(b.equals("u")){
                System.out.println("星期二（Tuesday）");
            }
            else if(b.equals("h")){
                System.out.println("星期四（Thursday）");
            }
        }
        else if(a.equals("w")){
            System.out.println("星期三（Wednesday）");
        }
        else if(a.equals("f")){
            System.out.println("星期五（Friday）");
        }
        else if (a.equals("s")){
            System.out.println("您输入的字母有两个选项请输入该天的第二个字母：");
            Scanner one = new Scanner(System.in);
            String b = one.next();
            if(b.equals("u")){
                System.out.println("星期日（Sunday）");
            }
            else if(b.equals("a")){
                System.out.println("星期六（Saturday）");
            }
        }
    }
}

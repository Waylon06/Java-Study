import java.util.Scanner;

public class Judgegrade {
    public static void main(String[] args) {
        int score;
        System.out.println("请输入成绩：");
        Scanner in = new Scanner(System.in);
        score = in.nextInt();
        if(score>100){
            System.out.println("抱歉您的输入有误\n");
        }else if(score>=90&&score<=100){
            System.out.println("您的等级为“优秀”");
        }else if(score>=80&&score<90){
            System.out.println("您的等级为“良好”");
        }else if(score>=60&&score<80){
            System.out.println("您的等级为“中等”");
        }else if(score<60){
            System.out.println("您的等级为“不及格”");
        }
    }
}

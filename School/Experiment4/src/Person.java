import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        int age;
        System.out.println("请输入你的年龄；");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age<0){
            System.out.println("0");
        }
        else if (age>200){
            System.out.println("200");
        }
        else if (age>=0&&age<=200){
            System.out.println(age);
        }
    }
}

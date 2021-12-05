import java.util.Scanner;

public class answer04 {
    static public  void main(String[] args){
        System.out.println("请输入一段串字符");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int number = 0,letter = 0,blank = 0,other = 0;
        for(int i = 0; i < s.length(); i++){
            if(c[i]>='0' && c[i]<='9')
                number++;
            else if((c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z'))
                letter++;
            else if(c[i]==' ')
                blank++;
            else
                other++;
        }
        System.out.println("输入的数字个数为"+number+"输入的字母个数为"+letter
                +"输入的空格个数为"+blank+"输入其他字符个数为"+other);
    }

}

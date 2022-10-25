import java.util.Arrays;
import java.util.Scanner;

public class answer03 {
    public static void main(String[] args) {
        System.out.println("请输入要插入的数：");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a[] = new int[]{8,7,8,9,5,4,b};
        System.out.println("重新排序为：");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

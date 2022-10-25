import java.util.Scanner;

public class answer06 {
    public static void main(String[] args) {
        System.out.println("您要输入几个数？");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("请输入你要赋的值");
        Scanner sc1=new Scanner(System.in);
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc1.nextInt();
        }
        int min=arr[0];
        int zuixiao=0;
        int zuida=0;
        for(int i1=0;i1<arr.length;i1++){
            if(arr[i1]<min){
                min=arr[i1];
                zuixiao=i1;
            }
        }

        int max=arr[0];
        for(int i2=0;i2<arr.length;i2++){
            if(arr[i2]>max){
                max=arr[i2];
                zuida=i2;
            }
        }

        System.out.println(min);
        System.out.println(max);

        if(arr[0]==min){
            zuixiao=zuida;
        }
        int a=arr[0];
        arr[0]=max;
        arr[zuida]=a;


        if(arr[arr.length-1]!=min){
            int b=arr[arr.length-1];
            arr[arr.length-1]=min;
            arr[zuixiao]=b;
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

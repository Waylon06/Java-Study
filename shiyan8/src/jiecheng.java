public class jiecheng {
    public static void main(String[] args) {
        int a[] =new int[] {1,1,1,1,1,1,1,1,1,1};
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                a[i-1] = j*a[i-1];
            }
            sum = a[i-1] +sum;
        }
        System.out.println(sum);
    }
}


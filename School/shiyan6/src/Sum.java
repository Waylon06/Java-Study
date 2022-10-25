public class Sum {
    public static void main(String[] args) {
        float n[] = new float[20];
        int a[] = new int[20];
        int b[] = new int[20];
        float sum = 0;
        a[0] = 1;
        a[1] = 2;
        b[0] = 2;
        b[1] = 3;
        for (int i = 2;i<20;i++){
            a[i] = a[i-1] + a[i-2];
            b[i] = b[i-1] + b[i-2];
            n[i] =(float) b[i] / a[i];
        }
        for (int i = 0; i <20 ; i++) {
            sum += n[i];
        }
        System.out.println("前20项和为"+sum);
    }
}

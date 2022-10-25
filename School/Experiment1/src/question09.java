public class question09 {
    public static void main(String[] args) {
        long a[] = new long[20];
        long sum = 0;
        for (int i = 1; i < 20; i++) {
            a[i - 1] = 1;
            for (int j = 1; j <= i; j++) {
                 a[i - 1] *= j;
            }
        }
        for (int i = 0; i < 20; i++) {
            sum += a[i];
        }
        System.out.println("总和为"+sum);
    }
}

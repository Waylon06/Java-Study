public class answer02 {
    public static void main(String[] args) {
        int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}} ;
        int sum, b, c;
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+"\t");
            }
        }
        System.out.println();
        b = a[0][0] + a[1][1] + a[2][2];
        c = a[0][2] + a[1][1] + a[2][0];
        sum = c + b;
        System.out.println("总和为："+sum);
    }
}


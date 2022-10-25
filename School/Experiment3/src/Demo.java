public class Demo {
    int d[] = new int[3];
    double e[] = new double[3];
    public int demo1(int a, int b, int c){
        d[0] = a;
        d[1] = b;
        d[2] = c;
            int max = d[0];
            for (int i = 0; i < 3; i++) {
                if (d[i] > max){
                    max = d[i];
                 }
        }
        System.out.println(max);
        return max;
    }

    public double demo2(double a, double b, double c){
        e[0] = a;
        e[1] = b;
        e[2] = c;
            double max = e[0];
            for (int i = 0; i < 3; i++) {
                if (e[i] > max){
                    max = e[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        Demo de = new Demo();
        de.demo1(10,20,30);
        de.demo2(10.0,20.0,30.0);
    }
}

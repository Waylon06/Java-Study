public class Flower {
    public static void main(String[] args) {
        int a[] = new int[3];
        for (int i = 100; i < 1000; i++) {
            a[0] = i/100;
            a[1] = i/10%10;
            a[2] = i%10;
            if(a[0]*a[0]*a[0]+a[1]*a[1]*a[1]+a[2]*a[2]*a[2]==i){
                System.out.println(i);
            }
        }
    }
}

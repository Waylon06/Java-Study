public class question07 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 100; j++) {
                if(i+100==j*j){
                    for (int k = 0; k < 100; k++) {
                        if (i+100+168==k*k){
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}


public class TestDemo02 {
    public static void main(String[] args) {
        int a=200,i,b=0;
        for(a=200;a<1000;a++){
            for (i=2;i<a; i++){
                if(a%i==0){
                    break;
                }
                else {
                    System.out.print(a+"\t");
                    b++;
                    if(b%10==0) System.out.println();
                    break;
                }
            }
        }
    }

}

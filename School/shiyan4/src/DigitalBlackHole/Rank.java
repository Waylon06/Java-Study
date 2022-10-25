package DigitalBlackHole;

public class Rank  {
    public static int rank1(int a[]){
        int i,j,m;
        System.out.println("从小到大排序：");
        for(i=0;i<4;i++){
            for(j=0;j<3-i;j++){
                if(a[j]>a[j+1]){
                    m=a[j];
                    a[j]=a[j+1];
                    a[j+1]=m;
                }
            }
        }
        for (int k = 0; k < 4; k++) {
            System.out.println(a[k]);
        }
        return a[0]*1000+a[1]*100+a[2]*10+a[3];
    }
    public static int rank2(int a[]){
        int i,j,m;
        System.out.println("从大到小排序：");
        for(i=0;i<4;i++){
            for(j=0;j<3-i;j++){
                if(a[j+1]>a[j]){
                    m=a[j+1];
                    a[j+1]=a[j];
                    a[j]=m;
                }
            }
        }
        for (int k = 0; k < 4; k++) {
            System.out.println(a[k]);
        }
        return a[0]*1000+a[1]*100+a[2]*10+a[3];
    }
}

package RectTest;

public class RectTest {
    public static void main(String[] args) {
        PlainRect pr = new PlainRect();
        pr.PlainRect(20.0,10.0,10,10);
        System.out.println("面积为："+pr.area());
        System.out.println("周长为："+pr.perimeter());
        boolean a = pr.isInside(25.5,13);
        if (a == true){
            System.out.println("该点在矩形内");
        }
        else {
            System.out.println("该点不在矩形内");
        }
    }
}

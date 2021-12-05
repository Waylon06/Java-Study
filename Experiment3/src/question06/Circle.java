package question06;

public class Circle implements Shape {
    @Override
    public double area(double s) {
        s = 3.14*s*s;
        System.out.println(s);
        return s;
    }
}

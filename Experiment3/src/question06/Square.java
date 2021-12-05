package question06;

public class Square implements Shape{
    @Override
    public double area(double s) {
        s = (double) s*s;
        System.out.println(s);
        return s;
    }
}

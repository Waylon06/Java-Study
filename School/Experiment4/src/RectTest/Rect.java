package RectTest;

public class Rect {
    double width;
    double height;
    public void Rect(double width, double height){
        this.height = height;
        this.width = width;
    }

    private void Rect(){
        width = 0;
        height = 0;
    }

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return (double) 2*(width + height);
    }
}

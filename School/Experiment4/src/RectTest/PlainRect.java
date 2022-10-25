package RectTest;

import javax.management.MBeanException;

public class PlainRect extends Rect {
    double startX;
    double startY;

    public void PlainRect(double width, double height, double startX, double startY){
        this.startX = startX;
        this.startY = startY;
        super.Rect(width,height);
    }

    public void PlainRect(){

    }

    public boolean isInside(double x, double y){
        if (x>=startX&&x<=(startX+width)&&y>startY&&y<=(startY+height)){
            return true;
        }
        else {
            return false;
        }
    }
}

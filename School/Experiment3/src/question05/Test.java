package question05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {
    public static void main(String[] args) {
        Car c1 = new BWMCar();
        Car c2 = new CheryCar();
        c1.carname();
        c1.carprice();
        c2.carname();
        c2.carprice();
    }
}

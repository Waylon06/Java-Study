 package question04;

public class Client {
    public static void main(String[] args) {
        MyThread R1 = new MyThread( "线程-Thread-0");
        R1.start();

        MyThread R2 = new MyThread( "线程-Thread-1");
        R2.start();
    }
}

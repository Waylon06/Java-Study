package question04;

public class MyThread implements Runnable {
    private Thread t;
    private String threadName;

    MyThread( String name) {
        threadName = name;
    }

    @Override
    public void run() {
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread: " + threadName + ",正在输出：" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }

    public void start () {
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

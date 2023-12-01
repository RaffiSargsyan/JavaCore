package chapters.chapter11;

public class ThreadTest {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("T1");
        t1.start();

        MyThread t2 = new MyThread("T2");
        t2.start();


        Thread t3 = new Thread(new MyRunnable("T3"));
        t3.start();

        Thread t4 = new Thread(new Runnable() {


            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " :");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t4.start();
    }
}

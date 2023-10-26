package chapters.chapter11.newThread;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is ended");
    }
}

package chapters.chapter11.newThread;

public class MyThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread(), "Thread is Running");
        System.out.println(t.getName());
        t.start();


        for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main Thread is ended");
    }
}

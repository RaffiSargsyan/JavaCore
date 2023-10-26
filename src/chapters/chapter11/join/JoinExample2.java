package chapters.chapter11.join;

public class JoinExample2 extends Thread {


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





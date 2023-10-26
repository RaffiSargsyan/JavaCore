package chapters.chapter11;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван!");
            }
        });

        myThread.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt();
    }
}

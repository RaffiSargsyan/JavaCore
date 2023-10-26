package chapters.chapter11.thread;

public class ThreadTest2 {
    static int[] number = {12, 3, 4, 21, 33};
    static int max = number[0];

    public static void main(String[] args) {
        Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < number.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (max < number[i]) {
                        max = number[i];
                    }
                }
//                boolean b = true;
//                while (true) {
//                    System.out.println("ad");
//                } //deadlock
            }
        });
        maxThread.start();

        System.out.println("Hello");
        System.out.println("Hi");
//
//        try {
//            maxThread.join(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(max);
        if (!maxThread.isAlive());
        System.out.println(max);
    }
}

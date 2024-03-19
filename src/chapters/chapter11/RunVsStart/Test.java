package chapters.chapter11.RunVsStart;

import chapters.chapter11.MyThread;

public class Test {
    public static void main(String[] args) {
        Thread t = new MyThread("t");
        t.start();
//        t.run();
        System.out.println("Hello");
    }
}

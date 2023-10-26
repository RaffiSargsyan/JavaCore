package chapters.chapter11.counter;

public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();
        CounterThread t1 = new CounterThread("T1", c);
        CounterThread t2 = new CounterThread("T2", c);
        CounterThread t3 = new CounterThread("T3", c);

        t1.start();
        t2.start();
        t3.start();
    }
}

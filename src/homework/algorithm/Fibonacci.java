package homework.algorithm;

public class Fibonacci {

    public static void main(String[] args) {
//        System.out.println(fib(10));
//        System.out.println(fib3(10));
//        System.out.println(fb(100));


    }

    private static long fib3(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];

        }
        return array[n];
    }

    private static long fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    private static long fib2(int n) {
        if (n < 2) {
            return n;
        }
        long cur = 1;
        long prev = 0;
        for (int i = 2; i <= n; i++) {
            long temp = cur + prev;
            prev = cur;
            cur = temp;
        }
        return cur;
    }
}


    

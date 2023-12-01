package homework.algorithm;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(factorial(10));
//        factorial2(10);
        factorial3(1);
    }

    public static void factorial3(int n) {
        while (n <= 10) {
            System.out.println(n + " ");
            n++;
        }
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        else
            System.out.print(n + " ");
        factorial(n - 1);

        return 1;
    }
}

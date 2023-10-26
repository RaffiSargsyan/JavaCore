package chapters.chapter10.exceptionDemo;

public class Test2 {
    public static void main(String[] args) {

        try {
            divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Yes");
        }

    }

    /**
     * If you try to divide number by zero ,
     * it's fly ArithmeticException
     *
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}

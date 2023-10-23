package chapters.chapter10.Exc0;

public class Test {
    public static void main(String[] args) {
        int d = 0;
        int a;

        try {
            a = 25 / 0;
            System.out.println("we cannot see this line");
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e);//toString is overriding in Throwable
            System.out.println("We catch exception");
        }
    }
}

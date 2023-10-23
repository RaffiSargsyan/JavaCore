package classwork.lesson12;

public class OverloadTest {

    void test() {
        System.out.println("I am test() ");

    }
    void test(int a) {
        System.out.println("I am test (int a)");

    }

    void test(int a, double b, int k, String c) {
        System.out.println("I am test (int a int b)");
        System.out.println(a + " " + b + " " + k + " " + c);
    }

    void test(String a) {
        System.out.println("I am test (String a)");

    }

    double test(double a) {
        System.out.println("I am a test (double a)");
        return a + 1;
    }
}

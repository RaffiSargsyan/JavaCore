package classwork.lesson12;

public class OverloadTest {

    void test() {
        System.out.println("I am Test() ");

    }
    void test(int a) {
        System.out.println("I am Test (int a)");

    }

    void test(int a, double b, int k, String c) {
        System.out.println("I am Test (int a int b)");
        System.out.println(a + " " + b + " " + k + " " + c);
    }

    void test(String a) {
        System.out.println("I am Test (String a)");

    }

    double test(double a) {
        System.out.println("I am a Test (double a)");
        return a + 1;
    }
}

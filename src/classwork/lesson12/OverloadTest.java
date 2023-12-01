package classwork.lesson12;

public class OverloadTest {

    void test() {
        System.out.println("I am CollectionExample() ");
    }

    void test(int a) {
        System.out.println("I am CollectionExample (int a)");

    }

    void test(int a, double b, int c, String d) {
        System.out.println("I am CollectionExample (int a int b)");
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    void test(String a) {
        System.out.println("I am CollectionExample (String a)");
    }

    double test(double a) {
        System.out.println("I am a CollectionExample (double a)");
        return a + 1;
    }

    void showInfo(String str, int digit) {
        System.out.println("Overloading");
        System.out.println(str + " " + digit);
    }

    void showInfo(int digit, String str) {
        System.out.println("Overloading");
        System.out.println(str + " " + digit);
    }
}

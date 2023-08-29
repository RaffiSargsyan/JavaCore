package chapters.chapter7;

public class Overload {

    void test() {
        System.out.println("no parameter");
    }

    void test(int i) {
        System.out.println("i: " + i);
    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a " + a);
        return a * a;
    }

}

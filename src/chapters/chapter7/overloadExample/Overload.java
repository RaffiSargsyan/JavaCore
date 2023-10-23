package chapters.chapter7.overloadExample;

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

    //at first JVM cannot decide which methods call
//    int sum(int a) {
//        return a / a;
//    }
//
//    void sum(int a) {
//        System.out.println(a * a);
//    }
}

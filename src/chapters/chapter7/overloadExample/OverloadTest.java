package chapters.chapter7.overloadExample;

public class OverloadTest {
    public static void main(String[] args) {
        Overload overloadTest = new Overload();
        int x = 88;
        double result;

        overloadTest.test();
        overloadTest.test(10);
        overloadTest.test(x);
        overloadTest.test(12, 34);

        result = overloadTest.test(12.2);
        System.out.println("Result this method " + result);
    }
}

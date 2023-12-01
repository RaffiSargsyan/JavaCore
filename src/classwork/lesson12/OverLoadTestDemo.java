package classwork.lesson12;

public class OverLoadTestDemo {
    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();

        overloadTest.test();
        double test = overloadTest.test(2.2);
        System.out.println(test);

        overloadTest.test("Hi Mam");

        overloadTest.test(25, 0.9, 1998, "It's my birthday");
        overloadTest.showInfo(1, "one");
        overloadTest.showInfo("two", 2);
    }
}

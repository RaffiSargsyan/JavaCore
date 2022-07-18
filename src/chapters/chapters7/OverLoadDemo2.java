package chapters.chapters7;

public class OverLoadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a  и b:" + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутреннее преброзование при вызове "
                + "test (double) a: " + a);
    }

}

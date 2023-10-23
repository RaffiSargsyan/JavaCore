package chapters.chapter7.aboutInnerClasses2;

public class Outer2 {
    int outer_x = 100;

    void test() {
        Inner2 inner = new Inner2();
        inner.display();
    }

    class Inner2 {
        static int y = 10;

        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }

    void showY() {
//        System.out.println(y); y  is outside hear
    }
}

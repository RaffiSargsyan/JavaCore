package chapters.chapter7.aboutInnerClasses3;

public class Outer3 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner3 {
                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner3 inner3 = new Inner3();
            inner3.display();
        }
    }
}

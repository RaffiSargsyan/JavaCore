package homework.lesson14;

public class A {
    public int a = 10;

    void meth() {
        B b = new B();
        System.out.println(b.b);
    }

    class B {

        int b = 20;

        void meth() {
            System.out.println(a);
        }

        class c {
            void meth() {
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
//class B {
//    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.a);
//    }
}

package chapters.chapter8.Test8;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A(); //OBEKT KLASSA A
        B b = new B(); //OBEKT KLASSA B
        C c = new C(); // OBEKT KLASSA C

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}

package chapters.chapter7;

public class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme(){
        System.out.println("a = " + a);
        System.out.println("b = " + StaticDemo.b);
    }
}

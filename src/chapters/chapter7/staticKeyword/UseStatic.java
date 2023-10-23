package chapters.chapter7.staticKeyword;

public class UseStatic {
    static int a = 3;
    static int b;

    int z;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        System.out.println("z = " + z); we cannot use in static method Objects field
    }

    static {
        System.out.println("This is a static block");
        b = a * 10;
//        System.out.println(z); we cannot also use Objects field in static blocks
    }

    //but we can use static fields in non-static methods and blocks...simple example
    void setValue() {
        a = 8; //variable a declared static
    }

    {
        b = 9; //variable b also declared static
    }

    public static void main(String[] args) {
        UseStatic.meth(42);
    }
}

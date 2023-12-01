package chapters.chapter8.test1;

public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 20;
        superOb.j = 30;
        System.out.println("All of class A");
        superOb.showIJ();
        System.out.println();

        subOb.i = 70;
        subOb.j = 2;
        subOb.k = 1;
        System.out.println("All of class B");
        subOb.showIJ();
        subOb.showK();

        System.out.println("Sum of i , j and k");
        subOb.sum();
    }
}

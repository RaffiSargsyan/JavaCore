package lambda.staticAndDefalt.compatibility;

public class C implements A,B{
    @Override
    public void f() {
        A.super.f();
        System.out.println("C");
        B.super.f();
    }
}

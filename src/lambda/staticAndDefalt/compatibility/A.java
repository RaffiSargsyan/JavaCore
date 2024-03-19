package lambda.staticAndDefalt.compatibility;

public interface A {
    default void f(){
        System.out.println("B");
    }
}

package lambda.staticAndDefalt.compatibility;

public interface B {
    default void f(){
        System.out.println("B");
    }
}

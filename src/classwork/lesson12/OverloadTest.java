package classwork.lesson12;

public class OverloadTest {

    void test(){
        System.out.println("I am test() ");

    }
    void test(int a){
        System.out.println("I am test (int a)");

    }
    void test(int a, int b,String c){
        System.out.println("I am test (int a int b)");
    }

    void test(String a){
        System.out.println("I am test (String a)");
    }
}

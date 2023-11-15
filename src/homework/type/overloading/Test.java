package homework.type.overloading;

public class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void show(int a) {
        System.out.println(a);
    }

    void show(byte a) {
        System.out.println(a);
    }

    void show(int a, String b) {
        System.out.println(a + b);
    }

    void show(String b, int a) {
        System.out.println(b + a);
    }

    void show(String b, String a) {
        System.out.println(b + a);
    }

    void show(float a) {
        System.out.println(a);
    }

    void show(double a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
        Test myTest = new Test("Test1", 22);
        Test myTest2 = new Test(33, "Test2");
        myTest.show(3);
        myTest.show(1.1);
    }
}

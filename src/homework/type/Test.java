package homework.type;

public class Test {
    public int id;
    public String name;
    public int age;


    Test(int z) {
        age = z;
    }

     Test(String a1, int b1) {
        name = a1;
        age = b1;
    }

    Test(int c3, String c1, int c2) {
        this(c1, c2);
        id = c3;
    }

    public static void main(String[] args) {
        Test myTest = new Test(1, "a", 3);
    }
}

package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equals " + b);
        b = true;
        System.out.println("b equals " + b);
        if (b) System.out.println("we will see this code");
        b = false;
        if (b) System.out.println("we won't see it");

        System.out.println("10 > 9 equals " + (10 > 9));

        int x = 123_456_789;
        int y = 123__456__789;
        System.out.println(x + " " + y);
    }
}

package chapters.chapters1;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x <= 10; x++) {
            System.out.println("The variable x: " + x);
            System.out.println("The variable y: " + y);
            y = y - 2;
        }
    }
}

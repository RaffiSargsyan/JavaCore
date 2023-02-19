package chapters.chapters2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y; //local variables
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Знaчeниe x = " + x);
            System.out.println("Знaчeниe y = " + y);
            y = y - 2;
        }
    }
}

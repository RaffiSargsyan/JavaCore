package chapters.chapter5;

public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue; // Skip even numbers
            }
            System.out.println("Current number: " + i);
        }
    }
}
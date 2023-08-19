package chapters.chapters2;

public class ForTest {
    public static void main(String[] args) {
        int x;
        for (x = 0; x <= 10; x++) {
            System.out.println("Value x: " + x);
        }
        System.out.println("\n");

        for (int i = 10; i >= 0; i--) {
            System.out.println("Value i: " + i);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            int j = i + 1; //another variant, for this we don't change 'for'
            System.out.println(" This is text " + j);
        }
    }
}




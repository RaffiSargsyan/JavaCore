package chapters.chapters5;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass" + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            one:
            if (j == 10) break one;
            System.out.println(j + " ");
        }
    }
}

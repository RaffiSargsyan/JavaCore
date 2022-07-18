package chapters.chapters4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absalyutnoe znachenie ");
        System.out.println(i + " ravno " + k);

        i = -10;
        k = i < 0 ? -1 : i;
        System.out.print("Absalyutnoe znachenie ");
        System.out.println(i + " ravno " + k);

    }
}

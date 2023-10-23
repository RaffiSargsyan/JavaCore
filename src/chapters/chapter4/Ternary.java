package chapters.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i = 10;
        int k = i < 0 ? -i : i;

        System.out.print("Absolute value ");
        System.out.println(i + " equals " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value ");
        System.out.println(i + " equals " + k);

        System.out.println(i == 10 ? 101 : 202);
    }
}

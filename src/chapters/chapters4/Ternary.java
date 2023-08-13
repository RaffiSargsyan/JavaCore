package chapters.chapters4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i + " равно " + k);

    }
}

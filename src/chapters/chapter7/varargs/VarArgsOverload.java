package chapters.chapter7.varargs;

public class VarArgsOverload {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): "
                + "Argument count "
                + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...): "
                + "Argument count "
                + v.length + " content: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(String message, int... v) {
        System.out.println("vaTest(String, int ...): "
                + "Argument count: "
                + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Hello Mama ", 10, 20);
        vaTest(true, false, true);
    }
}

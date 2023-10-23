package chapters.chapter7.varargs;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + +v.length + " content");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One variable length parameter: ", 12);
        vaTest("Three variable length parameter: ", 12, 2, 3);
        vaTest("Without variable length parameter: ");
    }
}

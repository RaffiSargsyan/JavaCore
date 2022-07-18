package chapters.chapters3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 324.241;
        System.out.println("tip int i byte.");
        b = (byte) i;
        System.out.println("i v b" + i + " " + i);
        i = (int) d;
        System.out.println("d i i" + d + " " + i);

    }
}

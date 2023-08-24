package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConvert int to byte ");
        b = (byte) i;
        System.out.println("i and  b " + i + " and " + b);
        System.out.println("\nConvert double to int");
        i = (int) d;
        System.out.println("d and i " + d + " and " + i);
        b = (byte) d;
        System.out.println("\nConvert double to byte");
        System.out.println("d and b " + d + " " + b);

    }
}

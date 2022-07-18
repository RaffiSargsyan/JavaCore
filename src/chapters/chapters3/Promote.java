package chapters.chapters3;

public class Promote {
    public static void main(String[] args) {

        byte b = 42;
        char c = 'b';
        short s = 1024;
        int i = 30000;
        float f = 4.12f;
        double d = 2.23333;


        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + "+" + (i / c) + " - " + (d * s));
        System.out.println("result =" + result);
    }
}

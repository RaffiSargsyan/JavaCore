package chapters.chapters4;

public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int x = 4;
        int k = 1;
        boolean d = x > k;
        System.out.println(d);
    }
}

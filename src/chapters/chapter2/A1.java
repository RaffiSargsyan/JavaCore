package chapters.chapter2;

public class A1 {
    public static void main(String[] args) {
        System.out.println(fact(4));
        //4 = 1*2*3*4;
    }

    public static int fact(int x) {
        int r = 1;
        for (int i = 2; i <= x; i++) {
            r = r * i;
        }
        return r;
    }

    public static int factR(int x) {
        if (x == 0 || x == 1)
            return 1;
        return x * factR(x - 1);
    }
}

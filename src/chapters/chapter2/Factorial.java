package chapters.chapter2;

public class Factorial {

    public int fact(int x) {
        int result;
        if (x == 1) {
            return 1;
        } else {
            result = fact(x - 1) * x;
        }
        return result;
    }

    public static void main(String[] args) {

        Factorial f = new Factorial();
        System.out.println(f.fact(3));

    }
}

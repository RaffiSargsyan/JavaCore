package chapters.chapters1;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x - is less than y");

        x = x * 2;
        if (x == y) System.out.println("x - is equals to y");

        x = x * 2;
        if (x > y) System.out.println("x already bigger than y");

        if (x == y) System.out.println("We won't see it in console");
    }
}





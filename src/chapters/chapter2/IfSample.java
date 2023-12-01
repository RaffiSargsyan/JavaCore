package chapters.chapter2;

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

        int x1 = 'a';
        System.out.println(x1);
        char z1 = 97;
        System.out.println(z1);
        char z2 = 22121;
        System.out.println(z2);

        String str = "Aa";
        String str1 = "BB";
        System.out.println(str.equals(str1));

        System.out.println(str.hashCode());   //2112
        System.out.println(str1.hashCode());  //2112

        double b = 201.1;
        int b1;
        b1 = (int) b;
        System.out.println(b1);
    }
}





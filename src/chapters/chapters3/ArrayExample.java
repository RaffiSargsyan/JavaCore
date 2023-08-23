package chapters.chapters3;

public class ArrayExample {

    public static void main(String[] args) {
        int len = 10;
        int[] numbers = new int[len];
        System.out.println(numbers.length);
        int[] num = new int[200];
        System.out.println(num.equals(numbers));
        System.out.println();

        num[23] = 2313;
        System.out.println(num[23]);

        num[23] = 2400;
        System.out.println(num[23]);

        int x = 10;
        System.out.println(x);
    }
}

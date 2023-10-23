package chapters.chapter3;

public class ArrayExample {

    public static void main(String[] args) {
        int len = 10;
        int[] numbers = new int[len];
        System.out.println(numbers.length);

        int[] num = new int[20];
        System.out.println(num.equals(numbers));


        num[0] = 19;
        System.out.println(num[0]);

        num[2] = 19;
        System.out.println(num[0]);
    }
}

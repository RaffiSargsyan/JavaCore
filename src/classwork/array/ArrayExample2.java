package classwork.array;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int x = 0; x < 30; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = max + numbers[i];
        }
        System.out.println("\n" + max);
        System.out.println(max / numbers.length);
    }
}

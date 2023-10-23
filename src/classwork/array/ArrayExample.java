package classwork.array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {22, 4, 3, 4, 5, 3, 2,};

        System.out.println(numbers.length / 2);

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) { // print all numbers of array
            System.out.print(numbers[i] + " ");
        }

        System.out.println(numbers[7] = 2); //ArrayIndexOutOfBound


        System.out.println(numbers[0]);
        numbers[0] = 1;
        System.out.println(numbers[0]);
    }
}

package homework.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {8, 3, -9, 10, 1};

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        for (int x : numbers) {
            System.err.print(x + " ");
        }

        System.out.println();

        int item;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    item = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = item;
                }
            }
        }
        for (int x : numbers) {
            System.err.print(x + " ");
        }
    }
}


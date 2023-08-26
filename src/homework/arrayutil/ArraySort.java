package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};


//        int temp = array[0];
//        array[0] = array[1];
//        array[1] = temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("____________________");

        int[] numbers = {7, 55, 8, -8, 0, 14, 90, 65};
        int tmp;
        System.out.println("Big to little");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
//
//        System.out.print('\n');
//
//        System.out.println("Small to big");
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] > numbers[j]) {
//                    tmp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = tmp;
//                }
//
//            }
//            System.out.print(numbers[i] + ",");
//        }
    }
}



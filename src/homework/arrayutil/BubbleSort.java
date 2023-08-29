package homework.arrayutil;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};

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

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}



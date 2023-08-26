package homework.arrayutil;

public class MethodArrayUtil {

    int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void evenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.print(" Count " + count);
    }

    void oddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                count++;

            }
        }
        System.out.print("count  " + count);
    }

    int averageOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }

    int sumElement(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    void bubbleSort(int[] array) {
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
    }


    void bubbleSortReverse(int[] array) {

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



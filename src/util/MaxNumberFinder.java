package util;

public class MaxNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 3};
        int maximum = findMax(numbers);

        System.out.println("The maximum number is: " + maximum);
    }

    public static int findMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

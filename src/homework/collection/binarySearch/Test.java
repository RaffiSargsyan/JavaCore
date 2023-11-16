package homework.collection.binarySearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 6, 2, -12, 4, 8, 9, 99, 2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 99);
        System.out.println(index);

    }
}

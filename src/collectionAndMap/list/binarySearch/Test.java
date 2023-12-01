package collectionAndMap.list.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 2, -12, 4, 8, 9, 99, 2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 99);
        System.out.println(index);

        int[] num = {77, 1, 3, 8, 1, -1, 81, 43, 6, 2, -12, 4, 8, 9, 99, 2};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
//        I found -3 index without Arrays.sort it's wrong
//        but with Arrays.sort method I found right index
        int index2 = Arrays.binarySearch(num, 4);
        System.out.println(index2);
        System.out.println(num[7]);

        List<Integer> list = new ArrayList<>(Arrays.asList(9, 2, 4, 65, 1, 2, 9, -4, -3, 11));
        Collections.sort(list);
        System.out.println(list);
        int searchIndex = Collections.binarySearch(list, 65);
        System.out.println(searchIndex);
    }
}

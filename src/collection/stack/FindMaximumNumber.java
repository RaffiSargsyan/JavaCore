
package collection.stack;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaximumNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(9, 19, 6, 8, 1));

        int maxNumber = findMaximum(arrayList4);

        System.out.println("Original ArrayList: " + arrayList4);
        System.out.println("Maximum number: " + maxNumber);
    }

    private static int findMaximum(ArrayList<Integer> arrayList) {
        int maxNumber = arrayList.get(0);

        for (int num : arrayList) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }
}


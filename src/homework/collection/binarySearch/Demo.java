package homework.collection.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(88);
        arrayList.add(-9);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(12);
        arrayList.add(99);
        arrayList.add(10);
        arrayList.add(15);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int value = Collections.binarySearch(arrayList, 10);
        System.out.println(value);
    }
}

package collectionAndMap.list.arrayList.arrayListMethods3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("A");
        StringBuilder s2 = new StringBuilder("B");
        StringBuilder s3 = new StringBuilder("C");
        StringBuilder s4 = new StringBuilder("D");

        StringBuilder[] arrays = new StringBuilder[]{s1, s2, s3, s4};
        List<StringBuilder> list = Arrays.asList(arrays);

        System.out.println(list);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Good", "Nice"));
        System.out.println(arrayList);

        arrays[0].append("f");
        System.out.println(list);
    }
}

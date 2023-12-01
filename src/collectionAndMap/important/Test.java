package collectionAndMap.important;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<Integer> listTwo = new ArrayList<>(List.of(4, 5, 6));
//        for (int i = 0; i < list.size(); i++) {
//            listTwo.add(list.get(i));
//        }
//        System.out.println(listTwo);

        listTwo.addAll(list);
        System.out.println(listTwo);
    }
}

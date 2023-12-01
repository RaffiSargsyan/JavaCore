package collectionAndMap.list.arrayList.arrayListMethods3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //1.add element with simple way
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(null);
        System.out.println(list1);

        //2.add element with double brace way
        List<Integer> list2 = new ArrayList<>() {{
            add(1);
            add(2);
            add(9);
            add(null);
        }};
        System.out.println(list2);

        //3.add element with class Arrays ,
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 9));
        System.out.println(list3);

        //4.add element with List.of but cannot be in list null element
        //and cannot change list -- line 33
        List<Integer> list4 = List.of(1, 2, 9);
//        list4.add(3);
        System.out.println(list4);

        //copy of list
        List<Integer> list5 = List.copyOf(list3);
        System.out.println(list5);


        List<Integer> list6 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list6.add(i);
        }
        System.out.println(list6);
    }

}

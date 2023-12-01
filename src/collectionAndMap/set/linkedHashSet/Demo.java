package collectionAndMap.set.linkedHashSet;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
//        linkedHashSet.add(10);
        linkedHashSet.add(19);
        linkedHashSet.add(9);
        linkedHashSet.add(8);
//        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(12, 5, 10, 8));

        LinkedHashSet<Integer> union = new LinkedHashSet<>(linkedHashSet);
//        union.retainAll(linkedHashSet1);
//        System.out.println(union);   // result [10,8]

//        union.addAll(linkedHashSet1);
//        System.out.println(union);      //result [10, 19, 9, 8, 12, 5]

        union.removeAll(linkedHashSet1);
        System.out.println(union);          //result [10,9 ]
    }
}

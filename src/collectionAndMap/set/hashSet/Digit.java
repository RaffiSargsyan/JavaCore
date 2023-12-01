package collectionAndMap.set.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Digit {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(9);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet);

        HashSet<Integer> hashSet2 = new HashSet<>() {{
            add(9);
            add(5);
            add(12);
            add(6);
            add(-1);
        }};

        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        //and another examples
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(2, 3, 4));

        set1.retainAll(set2);
        System.out.println(set1); // result: [2, 3]

        Set<Integer> hash1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> hash2 = new HashSet<>(List.of(2, 3, 4));

        Set<Integer> union1 = new HashSet<>(set1);
        union1.addAll(set2);
        System.out.println(union1); // result [1, 2, 3, 4]

        Set<Integer> set = new HashSet<>(List.of(2, 3, 4, 5, 6));
        Set<Integer> setTwo = new HashSet<>(List.of(1, 2, 3));
        set.removeAll(setTwo);
        System.out.println(set);  //result [4,5,6]

    }
}

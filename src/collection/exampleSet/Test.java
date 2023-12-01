package collection.exampleSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(null);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(17);
        hashSet.add(null);
        System.out.println(hashSet);

//        HashSet<String> names1 = new HashSet<>(Arrays.asList("Raffi", "Amalia", "Arpine", "Arpine", "Raffi", "Elianora", "Amalia"));
//        System.out.println(names1);


//
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Raffi", "Amalia", "Arpine", "Arpine", "Raffi", "Elianora", "Amalia"));

        HashSet<String> names1 = new HashSet<>(names);
        for (String s : names1) {
            System.out.print(s + "; ");
        }

        System.out.println();

        String[] names2 = {"Raffi", "Amalia", "Arpine", "Arpine", "Raffi", "Elianora", "Amalia"};
        HashSet<String> stringHashSet = new HashSet<>(Arrays.asList(names2));
        System.out.println(stringHashSet);
    }
}


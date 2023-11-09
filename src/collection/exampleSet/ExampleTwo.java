package collection.exampleSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleTwo {
    public static void main(String[] args) {
        String s = "Hello from Java Hello 2023 lesson 2023";
        String[] s1 = s.split(" ");
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(s1));
        System.out.println(hashSet);
        for (String x : hashSet) {
            System.out.print(x + " ");
        }
//
//        for (int i = 0; i < s1.length; i++) {     //with cycle for
//            hashSet.add(s1[i]);
//        }
//        System.out.println(hashSet + " ");


//        HashSet<String> stringHashSet = new HashSet<>();
//        stringHashSet.add("a");
//        stringHashSet.add("a");
//        System.out.println(stringHashSet);
    }
}

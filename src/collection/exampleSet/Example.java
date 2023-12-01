package collection.exampleSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(22);
        hashSet.add(1);
        hashSet.add(-8);
        hashSet.add(99);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(55);
        hashSet.add(15);
        hashSet.add(995);
        System.out.println("HashSet" + " " + hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet Contains");

        Object[] objects = treeSet.toArray();  //change to array
        for (int i = objects.length - 1; i >= 0; i--) {
            System.out.print(objects[i] + " ");
        }
        for (Integer x : treeSet) {
            System.out.print(x + " ");
        }
    }
}

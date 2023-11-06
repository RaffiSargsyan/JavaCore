package chapters.chapter14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Raffi");
        treeSet.add("Amalia");
        treeSet.add("Arpine");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("-----");
        Set<Integer> treeSetInt = new TreeSet<>();
        treeSetInt.add(10);
        treeSetInt.add(5);
        treeSetInt.add(1);
        for (Integer integer : treeSetInt) {
            System.out.println(integer);

        }
    }
}

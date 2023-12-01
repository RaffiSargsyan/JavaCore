package collectionAndMap.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(80);
        set.add(1);
        set.add(1);
//        set.add(null);
        set.remove(5);
        System.out.println(set);

        System.out.println(set.contains(10)); //true
    }
}

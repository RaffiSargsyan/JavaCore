package map.example2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(8, "I can");
        map.put(9, "I try");
        map.put(10, "I am from Armenia");
        map.put(null, "This is null");
        System.out.print(map + ", ");
        System.out.println(map.get(null));

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(8, "I can");
        treeMap.put(9, "I try");
        treeMap.put(10, "I am from Armenia");
//        treeMap.put(null, "This is null");   //in TreeMap key cannot be null, because it's comparable
        System.out.print(treeMap + ", ");
//        System.out.println(treeMap.get(null));

        System.out.println("\n");
        TreeMap<Human, String> treeMap1 = new TreeMap<>(new AgeComparator());
        treeMap1.put(new Human("Amalia", 25), "First Object");
        treeMap1.put(new Human("Raffi", 20), "Second Object");
        treeMap1.put(new Human("Lucy", 29), "Third Object");

        System.out.println(treeMap1);
    }
}

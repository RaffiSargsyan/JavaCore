package map.treeMapExample;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(19, "Raffi");
        treeMap.put(3, "Amalia");
        treeMap.put(1, "Lucy");
//        treeMap.put(null, "Lucy");
        System.out.println(treeMap);
        Set<Integer> integers = treeMap.keySet();
    }
}


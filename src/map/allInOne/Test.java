package map.allInOne;

import collection.comparableVScomparator.NameComparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //The like keys in HashMap will be replaced
        HashMap<Integer, String> hashMap = new HashMap<>() {{
            put(10, "You are the best");
            put(4, "I can do it");
            put(34, "Hello World");
            put(10, "How do you feel");
            put(15, "You are the best");
            put(-9, "C.C. Catch");

        }};
        System.out.println(hashMap + ", ");


        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(10, "You are the best");
        hashMap2.put(4, "I can do it");
        hashMap2.put(34, "Hello World");
        hashMap2.put(10, "How do you feel");
        hashMap2.put(-9, "C.C. Catch");
        hashMap2.put(null, "You are the best");
        System.out.println(hashMap2 + ", ");

        System.out.println();

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "How do you feel");
        treeMap.put(4, "I can do it");
        treeMap.put(99, "C.C. Catch");
        treeMap.put(-1, "Nice");
        System.out.println(treeMap);
        Collection<String> values = treeMap.values();
        System.out.println(values);

//        hashMap2.put(null, "You are the best"); //we cannot have null keys

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Verb TO BE");
        linkedHashMap.put(2, "I am");
        linkedHashMap.put(3, "You are");
        linkedHashMap.put(4, "He,She,It,-is");
        linkedHashMap.put(4, "Am,Is,Are");
        linkedHashMap.put(null, "English");
        Set<Integer> integers = linkedHashMap.keySet();
        Object[] objects = integers.toArray();
        Comparator<Object> reversed = Collections.reverseOrder().reversed();
        System.out.println(reversed);
        System.out.println(linkedHashMap + ", ");

//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(12);
//        set.add(12);
//        set.add(null);
//        set.add(null);
//        System.out.println(set);
//        HashSet<Integer> set1 = new HashSet<>();
//        set1.add(null);
//        set1.add(null);
//        System.out.println(set1);
//        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
//        set2.add(null);
//        set2.add(null);
//        System.out.println(set2);

        TreeMap<Integer, String> set = new TreeMap<>();
//        set.put(null, "UsA");
//        set.put(null, "Usa");
        System.out.println(set);

        HashMap<Integer, String> set1 = new HashMap<>();
        set1.put(null, "UsA");
        set1.put(null, "Usa");
        System.out.println(set1);

        LinkedHashMap<Integer, String> set2 = new LinkedHashMap<>();
        set2.put(null, "UsA");
        set2.put(null, "Usa");
        System.out.println(set2);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(12);
//        queue.add(null);
//        queue.add(null);
        System.out.println(queue);

    }

}

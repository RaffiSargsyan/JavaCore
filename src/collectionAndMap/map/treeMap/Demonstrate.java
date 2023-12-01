package collectionAndMap.map.treeMap;

import java.util.TreeMap;

public class Demonstrate {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student student1 = new Student("Lucy", 55);
        Student student2 = new Student("Mariam", 25);
        Student student3 = new Student("Mary", 13);
        Student student4 = new Student("Amalia", 2);


        treeMap.put(1.4, student1);
        treeMap.put(5.4, student2);
        treeMap.put(5.3, student3);
//        treeMap.put(null, student3);
        treeMap.putIfAbsent(1.9, student4);

        //remove
//        treeMap.remove(1.4);
//        System.out.println(treeMap);

        //get method
        treeMap.get(5.4);
        System.out.println(treeMap);

        //we cannot have null key in TreeMap
//        System.out.println(treeMap.get(null));

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

        System.out.println(treeMap.tailMap(5.2));

        System.out.println(treeMap.headMap(1.5));

        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.lastEntry());

    }
}

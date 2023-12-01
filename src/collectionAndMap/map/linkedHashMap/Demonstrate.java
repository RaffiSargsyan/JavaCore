package collectionAndMap.map.linkedHashMap;

import collectionAndMap.map.treeMap.Student;

import java.util.LinkedHashMap;

public class Demonstrate {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>(10,0.7f,true);
        Student student1 = new Student("Arpine", 27);
        Student student2 = new Student("Amalia", 22);
        Student student3 = new Student("Raffi", 25);

        linkedHashMap.put(8, student1);
        linkedHashMap.put(13, student2);
        linkedHashMap.put(null, student3);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(8));
        System.out.println(linkedHashMap.get(13));
        System.out.println(linkedHashMap.get(null));

        System.out.println(linkedHashMap);
    }
}

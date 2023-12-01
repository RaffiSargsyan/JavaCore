package collectionAndMap.set.treeSet.example;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new AgeComparator());
        Student student1 = new Student("Arpine", 27);
        Student student2 = new Student("Amalia", 22);
        Student student3 = new Student("Raffi", 25);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        System.out.println(treeSet);

        System.out.println(treeSet.first());  //return first Object

        System.out.println(treeSet.last()); //return last Object

        System.out.println(treeSet.headSet(student3));
    }
}

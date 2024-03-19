package collectionAndMap.queue.priority;

import collectionAndMap.set.treeSet.example.AgeComparator;

import java.util.Collections;
import java.util.PriorityQueue;

public class DemoStudent {
    public static void main(String[] args) {

        PriorityQueue<Student> students = new PriorityQueue<>(new NameComparator());
        students.add(new Student("Raffi", 20));
        students.add(new Student("Amalie", 20));
        students.add(new Student("Arpine", 27));
        System.out.println(students);






    }
}


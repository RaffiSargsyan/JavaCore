package collection.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Amalia");
        priorityQueue.add("Arpine");
        priorityQueue.add("Raffi");
        priorityQueue.add("Raffi");
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(3);
        integers.add(10);
        integers.add(1);

        System.out.println(integers.poll());
        System.out.println(integers.poll());
        System.out.println(integers.poll());

        System.out.println(integers);
    }
}

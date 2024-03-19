package collectionAndMap.queue.priority;

import chapters.chapter3.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueExOne {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(8);
        queue.add(14);
        queue.add(4);
//        queue.add(null);
        System.out.println(queue);

        //4,8,10,14

//        System.out.println(queue.peek());
//        System.out.println(queue.poll());

        //4,8,10,14
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
    }
}

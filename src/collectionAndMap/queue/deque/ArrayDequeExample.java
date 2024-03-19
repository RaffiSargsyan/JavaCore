package collectionAndMap.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
//        numbers.add(null);
        System.out.println(numbers);
        System.out.println(numbers.peek());

        numbers.getLast();
        numbers.add(21);
        numbers.addFirst(123);
//        numbers.addFirst(101);
//        System.out.println(numbers);
//        numbers.removeLast();
//        System.out.println(numbers);
//
//        System.out.println(numbers.pollLast());

//        System.out.println(numbers.getFirst());
//        System.out.println(numbers.peekFirst());
    }
}

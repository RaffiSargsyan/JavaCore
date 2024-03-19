package collectionAndMap.queue.linkedList;

import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue<String> names = new java.util.LinkedList<>();
        names.add("Amalia");
        names.add("Arpine");
        names.add("Raffi");
        names.add("Sos");
        names.add("Elianora");
        names.offer("Gayane");


        //remove first element method remove and pool

        //NoSuchElementException throws method remove

//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();


        //method pool return null when queue is empty, and we try remove=poll element
//        names.poll();
//        names.poll();
//        names.poll();
//        names.poll();
//        names.poll();
//        names.poll();
//        System.out.println(names.poll());

        System.out.println(names);

        //return first element and when the queue is empty throws exception
//        System.out.println(names.element());
//        System.out.println(names.poll());
//
//        System.out.println(names.element());
//        System.out.println(names.poll());
//
//        System.out.println(names.element());
//        System.out.println(names.poll());
//
//        System.out.println(names.element());
//        System.out.println(names.poll());
//
//        System.out.println(names.element());
//        System.out.println(names.poll());
//
//        System.out.println(names.element());
//        System.out.println(names.poll());System.out.println(names.element());


        //return null if queue is empty
        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());
        System.out.println(names.poll());

        System.out.println(names.peek());

    }
}

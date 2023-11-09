package collection.exampleList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 8, 9, 5));
//        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 9, 86, 31, 32, 7, 4, 8, 19));

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + " ");

        }
        System.out.println();

        System.out.println("Remove even elements");

        System.out.println(linkedList);
//        for (int i = 0; i < linkedList.size(); i++) {
//            if (linkedList.get(i) % 2 == 0) {   this variant and the following is complex logic, but we can remove item
//                linkedList.remove(i);
//            }
//        }
//        System.out.println(linkedList);
//        for (int i = linkedList.size() - 1; i >= 0; i-- ) {
//            if (linkedList.get(i) % 2 == 0) {
//                linkedList.remove(i);
//            }
//        }
//        System.out.println(linkedList);
//        for (Integer x : linkedList) {
//            if (x % 2 == 0)
//                linkedList.remove(x);
//        }
//        System.out.println(linkedList); we cannot remove item with foreach

        Iterator<Integer> iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            if (next % 2 == 0)
                iterator1.remove();
        }
        System.out.println(linkedList);

        LinkedList<Integer> link = new LinkedList<>();

        link.addFirst(4);
        link.addLast(9);
        link.addLast(99);

        link.offer(5);
        System.out.println(link.poll());
        System.out.println(link.peekLast());

//        Iterator<Integer> iterator2 = link.iterator();
//        while (iterator2.hasNext()) {
//            Integer next = iterator2.next();
//            System.out.println(next);
//        }

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(null);
        integers.add(null);
        integers.add(4);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }
        Iterator<Integer> iterator3 = integers.iterator();
        while (iterator3.hasNext()) {
            Integer next = iterator3.next();
            System.out.print(next + " ");
//        }

        }
    }
}
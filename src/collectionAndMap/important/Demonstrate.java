package collectionAndMap.important;

import java.util.*;

public class Demonstrate {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(8, 10, 20, 40, 2, 4, 3, 5, 11));

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            }
//        }
//
//        System.out.println(list);


        //remove even elements
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//                System.out.print(next + " ");
//            }
//        }
//        System.out.println();
//        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<String> list1 = new ArrayList<>(List.of("Amalia", "Raffi"));
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);

        LinkedList<Integer> newList = new LinkedList<>(List.of(2, 3, 4, 5));

        ListIterator<Integer> listIterator = newList.listIterator(newList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }

    }
}

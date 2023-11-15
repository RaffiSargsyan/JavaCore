package collection.stack;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 2, 1));
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(55, 1, 3));

        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);


        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.sort(Collections.reverseOrder());
        System.out.println(arrayList2);

        List<Integer> integerList = new ArrayList<>(Collections.nCopies(4, 9));
        List<Integer> integerList1 = new ArrayList<>(Collections.nCopies(5, 1));
        System.out.println(integerList1.addAll(integerList));
        System.out.println(integerList1);

        List<Integer> integers = new ArrayList<>() {{
            add(1);
            add(2);
            add(99);

        }};
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(9, 4, 6, 8, 1));
        Iterator<Integer> iterator1 = arrayList3.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            if (next % 2 == 0) {
                System.out.print(next + " ");
            }
        }

        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(9, 4, 99, 6, 8, 1));
        Iterator<Integer> iterator4 = arrayList4.iterator();
        int max = arrayList4.get(0);
        for (Integer x : arrayList4) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}

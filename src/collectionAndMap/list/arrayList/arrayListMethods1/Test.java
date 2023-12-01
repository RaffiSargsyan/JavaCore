package collectionAndMap.list.arrayList.arrayListMethods1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Cech");
        arrayList1.add("Kalou");
        arrayList1.add("Lampard");
        arrayList1.add("Gigs");
        System.out.println(arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<>(30);
        arrayList2.add("Amalia");
        arrayList2.add(1, "Raffi");
//        arrayList2.add(3, "Raffi");           indexOutOfBound
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
        System.out.println(arrayList1 == arrayList3);      //different objects

        ArrayList<Integer> copyDigits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            copyDigits.add(9);
        }
        for (int i = 0; i < 3; i++) {
            copyDigits.add(5);
        }
        System.out.println(copyDigits);

        ArrayList<Integer> nCopies = new ArrayList<>(Collections.nCopies(4, 10));
        ArrayList<Integer> nCopies2 = new ArrayList<>(Collections.nCopies(8, 1));
        nCopies.addAll(nCopies2);
        System.out.println(nCopies);

    }
}

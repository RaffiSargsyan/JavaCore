package homework.collection.arrayList.arrayListMethods3;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("How are you");
        arrayList.add("How do you feel");
        arrayList.add("Are you ready?");
        arrayList.add("It's so good");
        System.out.println(arrayList);

        List<String> stringList = arrayList.subList(1, 3);
        System.out.println(stringList);

        String[] str = arrayList.toArray(new String[arrayList.size()]);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        List<Integer> list = List.of(12, 3, 1);
        System.out.println(list);

        List<String> list1 = List.copyOf(arrayList);
        System.out.println(list1);


//
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Just a moment");
//        arrayList1.add("You are right");
//        arrayList1.add("It's so good");
//        arrayList1.add("How do you feel");
//        System.out.println(arrayList1);
//
//        arrayList.addAll(arrayList1);
//        System.out.println(arrayList);

//        arrayList.removeAll(arrayList1);
//        System.out.println(arrayList);

//        arrayList.retainAll(arrayList1);
//        System.out.println(arrayList);
//
//        boolean b = arrayList.containsAll(arrayList1);
//        System.out.println(b);

    }
}

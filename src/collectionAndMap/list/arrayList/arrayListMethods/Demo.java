package collectionAndMap.list.arrayList.arrayListMethods;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 3, 55, 1, 2));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>(Collections.nCopies(5, 2));
        list1.addAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
//        System.out.println(list1);

        List<String> names = new ArrayList<>();
        names.add("Amalia");

        System.out.println();

        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(12, 3, 4, 5));
        System.out.println(list3.get(1));

        //important
        String[] names1 = {"Raffi", "Raffi", "Arpine", "Arpine"};
        HashSet<String> str = new HashSet<>(Arrays.asList(names1));
        System.out.println(str);

//        for (String x : str) {
//            System.out.print(x + " ");
//        }

        String str2 = "Hello from Java Hello 2023 Lesson 2023";

        //Hello from Java 2023 Lesson
        String[] s = str2.split(" ");
        LinkedHashSet<String> lhSet = new LinkedHashSet<>(Arrays.asList(s));
        System.out.println(lhSet);

        for (String x : lhSet) {
            System.out.print(x + " ");
        }
        System.out.println();
        Iterator<String> iterator = lhSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" "); // Добавляем пробел, если есть еще элементы
            }
        }
    }
}

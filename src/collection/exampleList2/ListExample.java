package collection.exampleList2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(8);

        System.out.println(integers.toString());
        integers.add(3, 9);
        System.out.println(integers);

        integers.add(0, 19);
        System.out.println(integers);

//        integers.add(6, 9); index out of bound ...
        integers.remove(1);  //remove index
        System.out.println(integers);

        System.out.println(integers.remove(Integer.valueOf(3))); //remove value of list
        System.out.println(integers);


        integers.set(1, 19);
        System.out.println(integers);


        System.out.println(integers.indexOf(19)); //get index with value
        System.out.println(integers.lastIndexOf(19)); //get last index with value

        System.out.println(integers.get(0)); //get value with index

        System.out.println(integers);

        System.out.println(integers.size());

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 != 0) {
                System.out.print(integers.get(i) + " ");
            }
        }
        System.out.println();

        System.out.println(integers.contains(19));
        System.out.println(integers.isEmpty());

        //with Arrays asList static function we can add elements in list
        List<String> stringList = new ArrayList<>(Arrays.asList("Arpine", "Amalia", "Raffi"));
        System.out.println(stringList);

        ArrayList<Integer> integerArrayList = new ArrayList<>() {
            {
                add(5);
                add(10);
                add(15);
            }
        };
        System.out.println(integerArrayList);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(1);
        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>(Collections.nCopies(9, 5));
        List<Integer> list3 = new ArrayList<>(Collections.nCopies(5, 2));
        list2.addAll(list3);
        System.out.println(list2);


        System.out.println(integers);
        Collections.sort(integers);   //sort
        System.out.println(integers);

        Collections.sort(integers, Collections.reverseOrder());//reverse
        System.out.println(integers);

        List<String> names = new ArrayList<>();
        names.add("Arpine");
        names.add("Elianora");
        names.add("Sos");
        names.add("Amalia");
        names.add("Raffi");
        System.out.println(names);
        Collections.sort(names); // usual sort to A-Z

        Collections.sort(names, Collections.reverseOrder()); //usual sort to Z-A
        System.out.println(names);


    }
}

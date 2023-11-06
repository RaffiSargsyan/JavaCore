package chapters.chapter14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(10);
        arrayList.add("Amalia");
        arrayList.add("Amalia");
        arrayList.add(null);
        System.out.println(arrayList.get(2));


        arrayList.add(1, "Amal");
        System.out.println(arrayList.get(1));


        for (String s : arrayList) {
            System.out.print(s);
        }
    }
}


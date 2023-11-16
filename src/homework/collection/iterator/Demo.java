package homework.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + " ");
        }


        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
        System.out.println(arrayList);

    }
}

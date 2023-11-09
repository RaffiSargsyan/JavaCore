package collection.exampleList2;

import java.util.Collections;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(8);
        vector.add(4);
        vector.add(8);
        vector.add(4);
        vector.add(8);
        vector.add(4);
        vector.add(8);
        vector.add(4);
        vector.add(4);
        vector.add(4);
        System.out.println(Collections.max(vector));
        System.out.println(vector.size());
        System.out.println(vector.capacity());
//        System.out.println(vector.size());
//        System.out.println(vector.capacity());
//        for (int i = 0; i < vector.size(); i++) {
//            System.out.print(vector.get(i) + " ");
//        }
//        Iterator<Integer> iterator = vector.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.print(next + " ");
//        }

    }
}

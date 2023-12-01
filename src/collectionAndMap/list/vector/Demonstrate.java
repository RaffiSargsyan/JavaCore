package collectionAndMap.list.vector;

import java.util.Vector;
public class Demonstrate {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Amalia");
        vector.add("Lilianna");
        vector.add("Elianora");
        vector.add("Arpine");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.remove(1);
        System.out.println(vector);

        System.out.println(vector.get(0));
    }
}

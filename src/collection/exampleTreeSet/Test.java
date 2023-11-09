package collection.exampleTreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>(Collections.reverseOrder());
        integers.add(9);
        integers.add(4);
        integers.add(4);
        integers.add(1);

        System.out.println(integers);

        TreeSet<Human> humans = new TreeSet<>(new AgeComparator().reversed());
        humans.add(new Human("Arpine", 27));
        humans.add(new Human("Amalia", 23));
        humans.add(new Human("Raffi", 25));
        System.out.println(humans);

    }
}

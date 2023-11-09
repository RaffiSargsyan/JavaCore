package collection.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Arpine", 27, 1000));
        humans.add(new Human("Amalia", 22, 1200));
        humans.add(new Human("Raffi", 25, 90));

        System.out.println(humans);
        Collections.sort(humans, new AgeComparator().reversed());
        System.out.println("---" + humans);
        Collections.sort(humans, new NameComparator());
        System.out.println("---" + humans);

        Collections.sort(humans, new Comparator<Human>() { //with anonymous inner class compare salary
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        System.out.println(humans);


//        Collections.sort(humans, Collections.reverseOrder());
//        System.out.println(humans);
//
//        Human human = new Human("Amal", 23, 900);
//        Human human1 = new Human("Raf", 25, 80);

//        System.out.println(human.compareTo(human1));

    }
}

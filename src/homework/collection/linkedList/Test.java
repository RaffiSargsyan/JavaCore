package homework.collection.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        Human s1 = new Human("Arpine", 27);
        Human s2 = new Human("Amalia", 21);
        Human s3 = new Human("Raffi", 25);
        LinkedList<Human> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        Human s4 = new Human("Lili", 50);
        System.out.println(list.get(1).getName());

        //we can add element with index
        list.add(2, s4);
        System.out.println(list);

        //index out of bound
//        list.add(5, s4);
//        System.out.println(list);

        //add Human the last part
        list.addLast(s4);
        System.out.println(list);

        //add Human the first part
        list.addFirst(s4);
        System.out.println(list);

        System.out.println();


        Human a1 = new Human("Ani", 18);
        Human a2 = new Human("David", 17);
        LinkedList<Human> humans = new LinkedList<>();
        humans.add(a1);
        humans.add(a2);
        System.out.println(humans);

        list.addAll(humans);
        System.out.println("We have already " + list.size());
        System.out.println(list);

//        list.removeLast();
//        list.removeAll(humans);
//        list.remove(0);
//        System.out.println(list);

    }
}

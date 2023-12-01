package practice;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        String name = "Elianora";
        List<Character> list = new LinkedList<>();
        char[] chars = name.toCharArray();
        for (Character x : chars) {
            list.add(x);
        }

        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            Character previous = listIterator.previous();
            System.out.print(previous);
        }

    }
}

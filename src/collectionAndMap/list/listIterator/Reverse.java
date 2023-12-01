package collectionAndMap.list.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
    public static void main(String[] args) {
        String s = "Amalia";
        reverse(s);

    }

    public static void reverse(String s) {

        List<Character> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char x : chars) {
            list.add(x);
        }
        ListIterator<Character> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            Character previous = reverse.previous();
            System.out.print(previous + " ");
        }
    }
}



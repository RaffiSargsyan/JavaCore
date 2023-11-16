package homework.collection.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
    public static void main(String[] args) {
        String s = "Amalia";
        reverse(s);

    }

    public static void reverse(String s) {

        List<Character> as = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char x : chars) {
            as.add(x);
        }
        ListIterator<Character> reverse = as.listIterator(as.size());
        while (reverse.hasPrevious()) {
            Character previous = reverse.previous();
            System.out.print(previous + " ");
        }
    }
}



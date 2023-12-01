package collectionAndMap.list.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Reverse2 {
    public static void main(String[] args) {
        String name = "Elianora";
        List<Character> list = new LinkedList<>();
        char[] chars = name.toCharArray();
        for (Character x : chars) {
            list.add(x);
        }
        ListIterator<Character> reverseString = list.listIterator(list.size());
        while (reverseString.hasPrevious()) {
            Character previous = reverseString.previous();
            System.out.print(previous + " ");
        }

        System.out.println();

        String str = "Sargsyan";
        char[] chars1 = str.toCharArray();
        for (int i = chars1.length - 1; i >= 0; i--) {
            System.out.print(chars1[i] + " ");
        }
        System.out.println();


        String str2 = "Arpine";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            System.out.print(pop + " ");
        }
    }
}

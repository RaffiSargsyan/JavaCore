package homework.collection.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {

    public static void main(String[] args) {
        String s = "madam2";
        List<Character> list = new LinkedList();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }
}

package collectionAndMap.list.listIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";

        LinkedList<Character> list = new LinkedList<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        System.out.println(list);

        boolean isPalindrome = true;
        Iterator<Character> iterator = list.iterator();
        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (iterator.hasNext() && listIterator.hasPrevious()) {
            if (iterator.next() != listIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }
}

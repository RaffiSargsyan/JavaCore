package homework.collection.stack;

import chapters.chapter8.test1.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Arpine");
        stack.push("Amalia");
        stack.push("Raffi");
        stack.push("Nata");

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.get(3));
        System.out.println(stack.isEmpty());

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + " ");
        }

        System.out.println();

//        stack.setSize(11);
//        System.out.println(stack.size());

        System.out.println(stack);

        String peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack);

//        while (!stack.isEmpty()) {           line to line pop element
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
    }
}

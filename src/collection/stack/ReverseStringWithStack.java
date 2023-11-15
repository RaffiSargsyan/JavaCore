package collection.stack;

import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        String name = "Raffi";

        String reversedString = reverseStringWithStack(name);

        System.out.println("My own String " + name);
        System.out.println("Reversed String: " + reversedString);

    }

    private static String reverseStringWithStack(String input) {

        Stack<Character> stack = new Stack<>();

        char[] chars = input.toCharArray();
        for (char ch : chars) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}

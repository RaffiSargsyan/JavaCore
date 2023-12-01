package practice;

import java.util.Stack;

public class SecondTask {
    public static void main(String[] args) {

        String st = "I can do it";

        char symbols[] = st.toCharArray();

        //reverse String with for loop
        for (int x = symbols.length - 1; x >= 0; x--) {
            System.out.print(symbols[x]);
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
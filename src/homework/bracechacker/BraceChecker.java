package homework.bracechacker;

import chapters.chapter2.Stack;

//import java.util.Stack;

public class BraceChecker {
    private String text;
    private Stack stack = new Stack();
    int last;


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (last != '(') {
                        System.err.println("Error: closed " + c + " but opened " + (char) last + "at" + i);

                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (last != '{') {
                        System.err.println("Error: closed " + c + " but opened " + (char) last + "at" + i);

                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (last != '[') {
                        System.err.println("Error: closed " + c + " but opened " + (char) last + "at" + i);
                    }
                    break;
            }
        }
        while (stack.pop() != 0) {
            System.err.println("Error: opened " + (char) stack.pop() + " but not closed");
        }
    }
}



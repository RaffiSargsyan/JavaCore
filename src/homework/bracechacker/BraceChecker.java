package homework.bracechacker;


import homework.stack.Stack;

public class BraceChecker {


    private final String text;
    private final Stack stack = new Stack();


    BraceChecker(String text) {
        this.text = text;
    }


    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            }

            char check;
            switch (x) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[') {
                        System.out.print("opened " + check + "but close " + x + "in index " + i);
                    }
                    break;
                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{') {
                        System.out.print("opened " + check + "but close " + x + "in index " + i);
                        ;
                    }
                    break;
                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[') {
                        System.out.print("opened " + check + "but close " + x + "in index " + i);
                    }
                    break;
            }
        }
        char last;
        while ((last = (char) stack.pop()) != 0) {
            System.out.println("error opened " + last + "but not closed");
        }
    }
}



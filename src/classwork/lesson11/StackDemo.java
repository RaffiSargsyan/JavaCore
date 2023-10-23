package classwork.lesson11;

public class StackDemo {
    public static void main(String[] args) {
        Stack2 myStack = new Stack2();

        myStack.push(2);
        myStack.push(24);
        myStack.push(241);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(8);
        System.out.println(myStack.pop());
    }
}

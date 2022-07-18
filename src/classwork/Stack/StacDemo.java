package classwork.Stack;

public class StacDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(4);
        myStack.push(9);



        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(8);
        myStack.push(myStack.pop());
        myStack.push(myStack.pop());
        System.err.println(myStack.pop());

        System.err.println(myStack.pop());
    }

}

package chapters.chapter9.test2;

public class FixedStack implements IntStack {

    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }

}

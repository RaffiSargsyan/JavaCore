package chapters.chapter2;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int x) {
        if (tos == stack.length - 1) {
            System.out.println("stack is full");
        } else stack[++tos] = x;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public static void main(String[] args) {
        Stack stackTest = new Stack();
        stackTest.push(1);
        stackTest.push(1);
        stackTest.push(12);
        stackTest.push(12152);
        stackTest.push(1425);
        stackTest.push(1452);
        stackTest.push(14552);
        stackTest.push(1452);
        stackTest.push(12512);
        stackTest.push(22);
        System.out.println(stackTest.pop());
    }
}

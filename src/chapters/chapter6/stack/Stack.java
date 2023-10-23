package chapters.chapter6.stack;

class Stack {
    int stack[] = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(int x) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++index] = x;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack  is empty");
            return 0;
        } else {
            return stack[index--];
        }
    }
}
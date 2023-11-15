package collection.stack;

public class Stack<T> {
    int[] numbers = new int[10];
    int index = 0;

    Stack() {
        index = -1;
    }

    public <T> void push(int x) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            numbers[++index] = x;
        }
    }

    public <T> int pop() {
        if (index < 0) {
            System.out.println("Stack is empty yet");
            return 0;
        } else {
            return numbers[index--];
        }
    }

    public <T> boolean isEmpty() {
        return index == 0;
    }


}

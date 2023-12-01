package classwork.stack;

public class Stack {
    private int[] array = new int[10];
    private int index;

    public Stack() {
        index = -1;

    }

    public void push(int value) {
        array[++index] = value;
    }
    public int pop() {
        return array[index--];
    }
}

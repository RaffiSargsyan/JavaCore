package homework.stack;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos < stck.length -1){
            stck[++tos]= item;

        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        } else return stck[tos--];
    }
}


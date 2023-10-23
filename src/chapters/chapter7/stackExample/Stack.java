package chapters.chapter7.stackExample;

public class Stack {
    private int[] stack = new int[10];
    private int index;

    Stack(){
        index = -1;
    }
    void push(int number){
        if (index == 9){
            System.out.println("Stack already full");
        }
        else {
            stack[++index] = number;
        }
    }
    int pop(){
        if (index < 0){
            System.out.println("Stack is empty");
            return 0;
        }else {
            return stack[index --];
        }
    }
}

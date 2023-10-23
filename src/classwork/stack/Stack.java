package classwork.stack;

public class Stack {
    private int[]aray  = new int[10];
    private int index;

    public Stack(){
        index = -1;

    }
    public void  push(int value){
        aray[++index] = value;

    }
    public int pop(){
        return aray[index--];
    }
}

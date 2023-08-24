package chapters.chapter7;

public class StackNew {
    private int stck[];
    private int tos;

    StackNew (int size){
        stck = new int[size];
        tos = -1;
    }
    void push(int item){
        if (tos == stck.length-1)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    int pop(){
        if (tos<0){
            System.out.println("Стек не заполнен");
            return 0;
        }
        else return stck[tos--];
    }
}

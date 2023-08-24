package chapters.chapter7;

public class TestStackNew {
    public static void main(String[] args) {
        StackNew myStack1 = new StackNew(5);
        StackNew myStack2 = new StackNew(8);

        for (int i = 0; i < 8; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());


        }
        for (int i = 0; i < 8 ; i++) {
            System.out.println(myStack2.pop());
        }
    }
}

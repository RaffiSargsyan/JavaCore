package chapters.chapter9.test2;

public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(10);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.push(12);
        fixedStack.pop();
        fixedStack.pop();
    }
}

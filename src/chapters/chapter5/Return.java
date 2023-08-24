package chapters.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Until return");

        if (t) return;
        
        System.out.println("This statement will not be executed.");
    }
}

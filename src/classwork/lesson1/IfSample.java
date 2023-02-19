package classwork.lesson1;

public class IfSample {
    public static void main(String[] args) {
        int x = 30; //local variables
        int y = 20;
        if (x > y) {
            System.out.println("x` is big from y`");
            int c = 7;
            System.out.println(c);
        }
        System.out.println("after` if");
        //System.out.println(c); local 'c' not in place
    }
}

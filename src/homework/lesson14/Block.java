package homework.lesson14;

public class Block {
    public int a = 10;
    public static int b;

    static {
        System.out.println("From static block");
    }

    public Block() {
        if (20 > 15) {
            a = 40;
        } else {
            a = 30;
        }
        System.out.println(a);
    }
}

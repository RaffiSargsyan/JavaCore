package chapters.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; error  it's outside from block
        System.out.println("x: " + x); //x here is global
    }

}

package chapters.chapters3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) ;
        int y = 20;
        System.out.println("x i y: " + x + " " + y);
        x = y * 2;
    }
}

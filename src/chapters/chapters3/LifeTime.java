package chapters.chapters3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y havasar e" + y);
            y = 100;
            System.out.println("y arden havasar e:" + y);


        }
    }
}
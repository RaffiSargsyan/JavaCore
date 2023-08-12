package chapters.chapters2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) { //начало блока
            System.out.println("x меньше у");
        }            // конец блока
        x = x * 2;
        if (x == y) {
            System.out.println("x теперь равно у");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x теперь больше у");
        }
        if (x == y) {
            System.out.println("вы не увидите этого");
        }
    }
}





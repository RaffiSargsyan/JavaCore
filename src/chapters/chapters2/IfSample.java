package chapters.chapters2;

/*
Продемонстрировать применение условного оператора if
Присвоить исходному файлу имя IfSample.java
 */
public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x меньше у");
        }
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





package chapters.chapter6;

public class SquareDemo {
    public static void main(String[] args) {

        Square sq = new Square();

        int square = sq.square(10);
        System.out.println(square);

        int x = sq.onlyForHundred();
        System.out.println(x);
    }
}

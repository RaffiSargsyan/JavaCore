package classwork.lesson13;

public class FinalDemo {
    public static void main(String[] args) {
//        final int a =20;
//        System.out.println(a);
//        a=60;
//        System.out.println(a);
        final Box myBox = new Box(2,4,5);
        myBox.width = 6;
        System.out.println(myBox.width);

        System.out.println(Box.WARRANTY_YEAR);

    }
}

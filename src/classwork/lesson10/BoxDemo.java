package classwork.lesson10;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        System.out.println(mybox.depth);

        mybox.width = 5;
        mybox2.depth = 100;
        mybox.height = 45;
        mybox.depth = 30;

        System.out.println(mybox.depth) ;
    }
}

package classwork.lesson10;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(3, 4, 8);

        double vol = mybox.volume();

        System.out.println(vol * 2);

        Box myBox2 = new Box(4, 2, 1);

        System.out.println(myBox2.volume());

        System.out.println(mybox.equalTo(myBox2));
    }
}

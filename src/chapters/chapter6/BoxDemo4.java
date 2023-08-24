package chapters.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 2;
        myBox1.height = 12;
        myBox1.depth = 14;

        myBox2.width = 12;
        myBox2.height = 3;
        myBox2.depth = 33;

        double vol = myBox1.volumeResult();
        System.out.println("Volume is " + vol);
        System.out.println("And now volume equals " + vol / 2);

        vol = myBox2.volumeResult();
        System.out.println("Volume is " + vol);

    }
}

package chapters.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 33;

        myBox2.width = 3;
        myBox2.height = 12;
        myBox2.depth = 22;

        myBox1.volume();

        myBox2.volume();
    }
}

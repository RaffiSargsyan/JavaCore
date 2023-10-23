package chapters.chapter6.inheritance3;


public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 17;
        myBox1.depth = 20;

        myBox2.width = 10;
        myBox2.height = 17;
        myBox2.depth = 20;

        myBox1.volume();
        myBox2.volume();
    }
}

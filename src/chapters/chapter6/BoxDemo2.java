package chapters.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 3;

        myBox2.width = 9;
        myBox2.height = 12;
        myBox2.depth = 2;

        volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println(volume);

        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println(volume);
    }
}

package chapters.chapter6.inheritance2;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Volume equals -> " + vol);

        myBox2.width = 3;
        myBox2.height = 4;
        myBox2.depth = 6;
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("and now volume equals -> " + vol);

    }
}

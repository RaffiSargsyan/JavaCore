package chapters.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(1, 3, 5);
        Box myBox2 = new Box(1, 3, 5);

        double vol;
        vol = myBox1.volume();
        System.out.println(vol);

        System.out.println(myBox2.volume());

        System.out.println("Both values are 15");
    }
}

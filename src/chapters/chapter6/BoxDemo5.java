package chapters.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDim(2.9, 22, 12);
        myBox2.setDim(21, 35, 7);

        myBox1.volume();

        double vol = myBox1.volumeResult();
        System.out.println(vol);

        double vol2 = myBox2.volumeResult();
        System.out.println(vol);
    }
}

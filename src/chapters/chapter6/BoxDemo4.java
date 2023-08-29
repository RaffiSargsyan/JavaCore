package chapters.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 10;

        myBox2.width = 19;
        myBox2.height = 90;
        myBox2.depth = 19;

        vol = myBox1.volume();
        System.out.println(vol);
        vol = vol * 2;
        System.out.println(vol);

        System.out.println(myBox2.volume());

        System.out.println(myBox1.squareOnlyTen());


        System.out.println(myBox1.squareEachNumber(123));
    }
}

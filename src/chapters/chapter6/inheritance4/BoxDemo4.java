package chapters.chapter6.inheritance4;


public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double reslut;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 10;

        myBox2.width = 19;
        myBox2.height = 90;
        myBox2.depth = 19;

        reslut = myBox1.vol();
        System.out.println(reslut);

        reslut = reslut * 2;
        System.out.println(reslut);

        System.out.println(myBox2.vol());

        System.out.println(myBox1.squareOnlyTen());
        System.out.println(myBox1.squareEachNumber(123));
    }
}

package chapters.chapter6.inheritance5;


public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        myBox1.setDim(1, 3, 5);
        myBox2.setDim(90, 222, 94);

        vol = myBox1.vol();
        System.out.println("Volume equals " + vol);

        vol = myBox2.vol();
        System.out.println("MyBox's volume equals " + vol);
    }
}

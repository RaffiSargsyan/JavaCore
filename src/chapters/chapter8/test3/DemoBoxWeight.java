package chapters.chapter8.test3;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 12, 34, 5);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 5);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume is equals " + vol);
        System.out.println("Weight myBox1 equals " + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("Volume MyBox2 equals " + vol);
        System.out.println("Weight myBox2 equals " + myBox2.weight);
    }
}

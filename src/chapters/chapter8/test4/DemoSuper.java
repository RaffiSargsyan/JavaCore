package chapters.chapter8.test4;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 31, 2.2);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 24.2);
        BoxWeight myBox3 = new BoxWeight(2, 3, 4, 24.2);
        BoxWeight myCube = new BoxWeight(2, 3);
        BoxWeight myClone = new BoxWeight(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);

        vol = myBox3.volume();
        System.out.println(vol);

        vol = myClone.volume();
        System.out.println(vol);

        vol = myClone.volume();
        System.out.println(vol);

    }
}

package chapters.chapter7;

public class OverLoadCons2 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3(10,20,15);
        Box3 mybox2 = new Box3();
        Box3 mycube = new Box3(7);

        Box3 myclone = new Box3(mybox1);

        double vol;

        vol= mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        vol= mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        vol = myclone.volume();
        System.out.println(("Объем куба равен " + vol));
    }
}

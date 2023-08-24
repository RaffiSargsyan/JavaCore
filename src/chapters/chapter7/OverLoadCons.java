package chapters.chapter7;

public class OverLoadCons {
    public static void main(String[] args) {

        Box2 mybox1 = new Box2(10 ,20,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        double vol;

        vol= mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol= mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol= mycube.volume();
        System.out.println("Объем mycube равен " + vol);


    }
}

package chapters.chapter8.Test3;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight3 mybox1 = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 mybox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 mybox3 = new BoxWeight3();
        BoxWeight3 mycube = new BoxWeight3(3, 2);
        BoxWeight3 myclone = new BoxWeight3(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен" + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обем mybox2 равен " + vol);
        System.out.println(
                "Вес mybox2 равен" + mybox2.weight
        );
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Обем mybox3 равен " + vol);
        System.out.println(
                "Вес mybox3 равен" + mybox3.weight
        );
        vol = myclone.volume();
        System.out.println("Обем myclone равен " + vol);
        System.out.println(
                "Вес myclone равен" + myclone.weight
        );
        vol = mycube.volume();
        System.out.println("Обем mybox3 равен " + vol);
        System.out.println(
                "Вес mycube равен" + mycube.weight

        );
        System.out.println();
    }
}

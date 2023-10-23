package chapters.chapter8.test3;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(21, 3, 4, 5);
        Box plainbox = new Box();
        double vol;
        vol = boxWeight.volume();
        System.out.println("Объeм boxWeight равен  " + vol);
        System.out.println("Вес boxWeight равен " + boxWeight.weight);

        plainbox = boxWeight;
        vol = plainbox.volume();
        System.out.println("Объeм plainbox равен " + vol);
//        System.out.println("Вес plainbox равен " + plainbox.weight); //this is error

    }
}

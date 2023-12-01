package chapters.chapter8.test3;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(21, 3, 4, 5);
        Box plainBox = new Box();
        double vol;
        vol = boxWeight.volume();
        System.out.println("Volume boxWeight = " + vol);
        System.out.println("Weight boxWeight = " + boxWeight.weight);

        plainBox = boxWeight;
        vol = plainBox.volume();
        System.out.println("Volume plainBox = " + vol);
//        System.out.println("Weight plainBox = " + plainBox.weight); //this is error

    }
}

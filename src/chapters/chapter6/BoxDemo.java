package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox;         //another variant
        myBox = new Box();
//      Box mybox2 = myBox; copy objects
//      mybox2.width
        myBox = null;

        double vol;
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume equals -> " + vol);
    }
}

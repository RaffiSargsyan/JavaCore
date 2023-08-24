package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {

        Box myBox = new Box();

        System.out.println(myBox.depth);  //only zero

        myBox.width = 12;
        myBox.height = 9;
        myBox.depth = 3;

        System.out.println("The volume is " + myBox.width * myBox.height * myBox.depth);

//        double vol = myBox.width * myBox.height * myBox.depth;
//        System.out.println("The volume is " + vol);
    }
}

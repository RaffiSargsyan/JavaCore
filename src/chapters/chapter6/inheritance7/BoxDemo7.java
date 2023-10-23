package chapters.chapter6.inheritance7;


public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(1, 3, 5);
        Box myBox2 = new Box(1, 3, 5);

        double result;
        result = myBox1.vol();
        System.out.println(result);

        System.out.println(myBox2.vol());

        System.out.println("Both values are 15");
    }
}

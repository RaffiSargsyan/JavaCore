package chapters.chapter6.inheritance6;


public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double result;

        result = myBox1.vol();
        System.out.println(result);

        result = myBox2.vol();
        System.out.println(result);
    }
}

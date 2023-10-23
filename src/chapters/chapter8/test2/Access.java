package chapters.chapter8.test2;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setIJ(12, 23);

        subOb.sum();
        System.out.println("Sum " + subOb.total);//sum = 0
    }
}

package chapters.chapter7;

public class RetOb {
    public static void main(String[] args) {
        Test4 ob = new Test4(22);
        Test4 ob2;

        ob2 = ob.incrByTen();
        System.out.println("ob : " + ob.a);
        System.out.println("ob2 : " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2 : " + ob2.a);
    }
}

package chapters.chapter7.aboutMethod3;



public class CallByValue {
    public static void main(String[] args) {
        Test2 test = new Test2();
        int a = 15, b = 20;

        System.out.println("a and b before call " + a + " " + b);

        test.meth(a, b);
        System.out.println("a and b after call " + a + " " + b);
    }
}

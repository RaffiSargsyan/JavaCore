package chapters.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(12, 40);
        System.out.println("before call " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("after call  " + ob.a + " " + ob.b);
    }
}

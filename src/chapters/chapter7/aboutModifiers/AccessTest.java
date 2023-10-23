package chapters.chapter7.aboutModifiers;

public class AccessTest {
    public static void main(String[] args) {
        Modifiers ob = new Modifiers();
        ob.a = 1;
        ob.b = 2;
        System.out.println(ob.a + " " + ob.b);
//        ob.c = 3; //error this c we can reach only methods because its private
        ob.setC(3); // this is ok
        System.out.println(ob.getC());
    }
}

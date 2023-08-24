package chapters.chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;
        //ob.c oshibka
        ob.setc(100);//s pomoshyo metoda set eto stala verno

        System.out.println("a,b,c " + ob.a + " "+
                ob.b  + " " + ob.getc());
    }
}

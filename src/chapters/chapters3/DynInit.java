package chapters.chapters3;

public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        double c = Math.sqrt(a * a + b * b);
        double d = Math.min(a, b);
        System.out.println(d);
        System.out.println("The hypotenuse is " + c);
    }

}

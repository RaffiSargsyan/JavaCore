package chapters.chapters8.Test10;

public class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

   figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}

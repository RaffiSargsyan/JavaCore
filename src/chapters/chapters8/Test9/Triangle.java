package chapters.chapters8.Test9;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("В области треугольника.");
        return dim1 * dim2 /2;
    }
}

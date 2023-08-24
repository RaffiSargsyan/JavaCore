package chapters.chapter8.Test10;
 public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области четырехугольник");
        return dim1 * dim2;
    }
}

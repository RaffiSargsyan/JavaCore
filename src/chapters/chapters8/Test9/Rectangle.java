package chapters.chapters8.Test9;

public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В оьласти четырехуоголбника.");
        return dim1 * dim2;
    }
}

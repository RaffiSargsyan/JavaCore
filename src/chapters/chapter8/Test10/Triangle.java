package chapters.chapter8.Test10;

public class Triangle extends Figure {
    Triangle(double a, double b){
       super(a,b);
    }
    double area(){
        System.out.println("В области треуголника");
        return dim1 * dim2 /2;
    }
}

package chapters.chapters7;

public class Box {
    double width;
    double heigth;
    double depth;

    Box(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    double volume(){
        return width * heigth * depth;
    }
}

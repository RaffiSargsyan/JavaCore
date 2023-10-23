package classwork.lesson10;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    double volume() {
        return width * height * depth;
    }

    boolean equalTo(Box ob) {
        return  this.width == ob.width &&
                this.height == ob.height &&
                this.depth == ob.depth;
    }
}

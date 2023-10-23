package chapters.chapter7.inheritance2;

public class Box2 {
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    private double width;
    private double height;
    private double depth;

    //copy constructor
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

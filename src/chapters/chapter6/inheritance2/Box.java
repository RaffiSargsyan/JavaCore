package chapters.chapter6.inheritance2;

public class Box {

    double width;
    double height;
    protected double depth;

    void volume() {
        System.out.print("Volume equals ");
        System.out.println(width * height * depth);
    }
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        System.out.println("Constructing the Box object");
        width = 10;
        height = 10;
        depth = 10;
    }

    double vol() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    int squareOnlyTen() {
        return 10 * 10;
    }

    int squareEachNumber(int i) {
        return i * i;
    }

}

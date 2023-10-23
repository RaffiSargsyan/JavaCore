package classwork.lesson13;

public class Box {
    double width;
    double height;
    double depth;
    static String color = "red";
    static final int WARRANTY_YEAR = 1;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return depth * height * width;
    }

    boolean equalTo(Box Box) {
        return this.width == width &&
                this.height == height &&
                this.depth == depth;
    }

    static void printColor() {
        System.out.println(color);
    }
}

package chapters.chapters6;

public class Box {
    double width;
    double height;
    double depth;

   // double volume() {
   //     System.out.println("Объем равен ");
   //     System.out.println(width * height * depth);


    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

        Box() {
        System.out.println("Констпуирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;

    }
}









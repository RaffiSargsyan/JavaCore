package chapters.chapter8.instanceOf;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(1, 2, 3, 4);
        ColorBox colorBox = new ColorBox(2, 3, 4, 9);
        printVolumeDouble(boxWeight);
        printVolumeDouble(colorBox);
    }

    static void printVolumeDouble(BoxWeight box) {
        System.out.println(box.volume() * 2);
    }

    static void printVolumeDouble(ColorBox box) {
        System.out.println(box.volume() * 2);

//        if (box instanceof ColorBox) {
//            System.out.println("color");
//            ColorBox colorBox = (ColorBox) box;
//            System.out.println(colorBox.color);
//        }
//    }
//    static void printVolumeDouble(ColorBox colorBox) { this is overload
//        System.out.println(colorBox.volume() * 2);
//
//    }
    }
}
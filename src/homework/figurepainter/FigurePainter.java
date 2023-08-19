package homework.figurepainter;

public class FigurePainter {
    public static void main(String[] args) {
        //  for (int i = 0; i < 5; i++) {
        //      for (int j = 0; j <= i; j++) {
        //          System.out.print("* ");
        //      }
        //      System.out.println();
        //  }
        //  System.out.println();

//        for (int y = 0; y < 5; y++) {
//            for (int j = 4; j >= y; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();

//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("# ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


package homework.figurepainter;

public class FigurePainter2 {
    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            for (int j = 2; j < (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
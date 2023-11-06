package homework.figurePainter;

import java.io.File;

public class FigurePainter {
    char c = '#';

    void figureOne() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureTwo() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    void figureThree() {
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            for (int j = 2; j < (2 * i - 1); j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    void figureFour() {
        for (int y = 0; y < 5; y++) {
            for (int j = 4; j >= y; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
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

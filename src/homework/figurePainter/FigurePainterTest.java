package homework.figurePainter;

public class FigurePainterTest {
    public static void main(String[] args) {


        FigurePainter fp = new FigurePainter();
        fp.c = '%';
        fp.figureOne();
        fp.figureTwo();
        fp.figureThree();

        FigurePainter fpLast = new FigurePainter();
        fpLast.figureOne();
    }
}

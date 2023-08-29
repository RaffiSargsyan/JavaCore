package homework.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

        double plus = calculator1.plus(12, 13);
        plus = plus * 2;
        System.out.println(plus);

        System.out.println(calculator1.minus(4, 2));

        System.out.println(calculator1.multiply(4, 2));

        System.out.println(calculator1.divide(10, 2));
    }
}

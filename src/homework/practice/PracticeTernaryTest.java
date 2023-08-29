package homework.practice;

public class PracticeTernaryTest {
    public static void main(String[] args) {
        PracticeWithTernary practiceHomework = new PracticeWithTernary();

        long convert = practiceHomework.convert(102);
        System.out.println(convert);

        int i = practiceHomework.calcAge(10);
        System.out.println(i);

        int i1 = practiceHomework.nextNumber(99);
        System.out.println(i1);

        double v = practiceHomework.bigNumber(101, 101.05);
        System.out.println(v);

        boolean nameNum = practiceHomework.isNameNum(10.2, 10.2);
        System.out.println(nameNum);

        boolean b = practiceHomework.lessThanOrEqualToZero(-99);
        System.out.println(b);

        boolean b1 = practiceHomework.reverseBool(true);
        System.out.println(b1);

        int[] first = new int[99];
        int[] second = new int[88];
        System.out.println(practiceHomework.maxLength(first, second));
    }
}

package homework.practice3;

public class PracticeTernaryTest {
    public static void main(String[] args) {
        PracticeWithTernary practiceHomework = new PracticeWithTernary();
        System.out.println(practiceHomework.convert(12));

        System.out.println(practiceHomework.calcAge(1));

        int i = practiceHomework.nextNumber(10);
        System.out.println(i);

        System.out.println(practiceHomework.isNameNum(12.05, 12.004));

        System.out.println(practiceHomework.lessThanOrEqualToZero(-301));

        System.out.println(practiceHomework.reverseBool(true));

        System.out.println(practiceHomework.bigNumber(10, 12) + " now");

    }

}

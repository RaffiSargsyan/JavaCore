package homework.practic2;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
int minutes  = 10;
        System.out.println(practiceHomework.convert(minutes));

        System.out.println(practiceHomework.calcAge(11));

        System.out.println(practiceHomework.nexNumber(19));

        System.out.println(practiceHomework.isSameNum(10, 20));

        System.out.println(practiceHomework.lessThanorEqualToZero(-1));

        System.out.println(practiceHomework.reverseBool(false));

        int[] array1 = new int[20];
        int[] array2 = new int[13];
        System.out.println(practiceHomework.maxLength(array1, array2));
    }
}
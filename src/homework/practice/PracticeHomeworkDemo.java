package homework.practice;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        long min = ph.convert(40);
        System.out.println(min);
        int days= ph.calcAge(5);
        System.out.println(days);
        int nextn = ph.nextNumber(9);
        System.out.println(nextn);
        boolean num = ph.isSameNum(10, 20);
        System.out.println(num);
        boolean num1 = ph.isSameNum(5,5);
        System.out.println(num1);
        boolean numbers = ph.lessThanOrEqualToZero(100);
        System.out.println(numbers);
        boolean bool = ph.reverseBool(true);
        System.out.println(bool);
        int[] array = new int[20];
        int[] array2 = new int[15];
        int maxLenght = ph.maxLength(array, array2);
        System.out.println(maxLenght);


    }
}


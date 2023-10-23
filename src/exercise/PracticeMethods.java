package exercise;

public class PracticeMethods {

    long convert(int minutes) {
        return minutes * 60L;
    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNum(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThenEqualToZero(int value) {
        return value <= 0;
    }


    boolean reverseBoolean(boolean b) {
        return !b;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }

    public static void main(String[] args) {
        PracticeMethods practiceMethods = new PracticeMethods();

        System.out.println(practiceMethods.convert(10));

        System.out.println(practiceMethods.calcAge(9));

        System.out.println(practiceMethods.nextNum(9));

//        System.out.println(practiceMethods.isSameNum(12, 3));
        System.out.println(practiceMethods.isSameNum(12, 12));

//        System.out.println(practiceMethods.lessThenEqualToZero(12));
        System.out.println(practiceMethods.lessThenEqualToZero(-12));

        System.out.println(practiceMethods.reverseBoolean(true));

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3};
        int i = practiceMethods.maxLength(array, array2);
        System.out.println("Maximum length is " + i);
    }
}


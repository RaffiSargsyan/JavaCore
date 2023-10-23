package homework.practiceExamples;

public class PracticeWithTernary {
    long convert(int minutes) {
        return minutes * 60L;
    }

    int calcAge(int year) {
        return year * 365;
    }

    int nextNumber(int number) {
        return ++number;
    }

    double bigNumber(double x, double y) {
        return Math.max(x, y);
//        return x > y ? x : y;
    }

    boolean isNameNum(double a, double b) {
        return a == b ? true : false;
//        return a == b;
    }

    boolean lessThanOrEqualToZero(int number) {
        return number < 0 || number == 0 ? true : false;
//        return number < 0 || number == 0;
    }

    boolean reverseBool(boolean value) {
        return value ? true : false;
//        return value;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
//        return Math.max(array1.length, array2.length);
    }
}

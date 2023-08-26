package homework.practice3;

public class PracticeWithTernary {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int year) {
        return year * 365;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    int bigNumber(int x, int y) {
        int i = x > y ? x : y;
        return i;
    }

    boolean isNameNum(double a, double b) {
        boolean b1 = a == b ? true : false;
        return b1;
    }

    boolean lessThanOrEqualToZero(int number) {
        boolean b = number < 0 || number == 0 ? true : false;
        return b;

    }

    boolean reverseBool(boolean value) {
        boolean b = value ? true : false;
        return b;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        } else {
            return array2.length;
        }
    }
}

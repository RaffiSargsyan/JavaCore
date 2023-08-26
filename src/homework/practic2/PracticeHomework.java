package homework.practic2;

public class PracticeHomework {

    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        int y = years * 365;
        return y;

    }

    int nexNumber(int number) {
        int z = number++;
        return number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else
            return false;
    }

    boolean lessThanorEqualToZero(int number) {
        if (number <= 0) {
            return true;
        }
        return false;
    }

    boolean reverseBool(boolean value) {
        if (value == true) {
            return false;
        }
        return true;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        }
        return array2.length;
    }
}

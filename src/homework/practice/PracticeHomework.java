package homework.practice;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        if (years % 4 == 0) {
            return years * 365 + 1;
        } else {
            return years * 365;
        }

    }

    int nextNumber(int number) {

        return number + 1;
    }

    boolean isSameNum(int num, int num1) {
        if (num == num1) {
            return true;
        }

        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
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

    int maxLength(int[] array, int[] array2) {
        if (array.length > array2.length) {
            return array.length;
        }
        return  array2.length;

    }
}

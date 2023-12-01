package util;

public class Test {
    public static void main(String[] args) {
        int max = max(12, 3,99);
        System.out.println(max);
    }

    public static int max(int... numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

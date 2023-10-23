package chapters.chapter3;

public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("The mean value is equals " + result / 5);
            System.out.println(result);
        }

        int i = 10, k;
        k = i < 9 ? 100 : -1;
        System.out.println(k);
    }
}


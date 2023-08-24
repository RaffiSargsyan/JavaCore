package chapters.chapter5;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) { //i++
            System.out.println("i equals " + i);
            if (i == 10) done = true;
            i++;
        }

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            sum = sum + x;
        }
        System.out.println(sum);


        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum2 = sum2 + numbers[j];
        }
        System.out.println(sum2);
    }
}


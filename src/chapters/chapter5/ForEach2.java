package chapters.chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.println("The value is " + x);
            sum += x; //sum = sum + x
            if (x == 5) break;
        }
        int max = 0;
        System.out.println("The sum of the first five elements is " + sum);
        int numbers[] = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number equals= " + number);
            max = max + number;
            if (number == 3) break;
        }
        System.out.println(max);
    }
}

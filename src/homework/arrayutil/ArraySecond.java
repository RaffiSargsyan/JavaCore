package homework.arrayutil;

public class ArraySecond {
    public static void main(String[] args) {

        int[] numbers = {4, 10, 2, 99, 75, -5, 7, 10, 12};
//        int max = numbers[0];
//        int indexOfMax = 0;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//                indexOfMax = i;
//            }
//        }
//        System.out.println("maximum number = " + max);
//        System.out.println("index of our maximum number = " + indexOfMax);
//
//        int min = numbers[0];
//        int indexOfMin = 0;
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//                indexOfMin = i;
//            }
//        }
//        System.out.println("minimum number = " + min);
//        System.out.println("index of our minimum = " + indexOfMin);


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("only even numbers");


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("only odd numbers");


        int countOfEvens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println("count of our even numbers = " + countOfEvens);

        int countOfOdds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        System.out.println("count of our odd numbers = " + countOfOdds);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum all elements is " + sum);


        double averageOfArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            averageOfArray = sum / numbers.length;
        }
        System.out.println("and average these elements equals = " + averageOfArray);
    }
}




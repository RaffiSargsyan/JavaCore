package homework.arrayutil;

public class ArraySecond {
    public static void main(String[] args) {

//
//        int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println("maxinum = " + max);
//
//        int min = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.print("minumum = " + min);
//
//        System.out.println();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.print(numbers[i] + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                System.out.print(numbers[i] + " ");
//            }
//        }
//        System.out.println();
//
//        int countOfEvens = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                countOfEvens++;
//            }
//        }
//        System.out.println(countOfEvens);
//
//        int countOfOdds = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                countOfOdds++;
//            }
//        }
//        System.out.println(countOfOdds);
//
//        double sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);
//
//        double avg = sum / numbers.length;
//        System.out.println(avg);


        int[] numbers = {4, 10, 2, 99, 75, -5, 7, 10, 12};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        int countOfArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countOfArray++;
            }
        }
        System.out.println(countOfArray);

        int countOddofArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                countOddofArray++;
            }
        }
        System.out.println(countOddofArray);
        System.out.println();

        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        double average = sum / numbers.length;
        System.out.println(average);

    }
}




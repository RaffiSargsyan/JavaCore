package homework.exercise;


public class ArrayExamples {

    void printArray(int[] num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    void maxOfArray(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum number of our array is " + max);
    }

    void minOfArray(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Minimum number of our array is" + min);
    }


    void minOfArrayWithIndex(int[] num) {
        int min = num[0];
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                index = i;
            }
        }
        System.out.println("Minimum number is " + min + " it's situated in " + index + " index");
    }

    void printEvenNumbers(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0 && number[i] != 0) {
                System.out.print(number[i] + " ");
            }
        }
    }

    void printCountEvenNumbers(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0 && number[i] != 0) {
                count++;
            }
        }
        System.out.println("Count of our even elements are " + count);
    }

    void printOddNumbers(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                System.out.print(number[i] + " ");

            }
        }
    }

    void bubbleSort(int[] number) {
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number.length - i; j++) {
                if (number[j] < number[j - 1]) {
                    temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            }
        }
        for (int i : number) {
            System.out.print(i + " ");

        }
        System.out.println();
    }


    public void bubbleSortRevers(int[] number) {
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number.length - i; j++) {
                if (number[j] > number[j - 1]) {
                    temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            }
        }
        for (int i : number) {
            System.out.print(i + " ");
        }
    }

    void sumOfOurArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i];
            sum += num[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        ArrayExamples array = new ArrayExamples();
        int[] number = {9, 2, 18, -19, 4, 99};

        array.maxOfArray(number);

        array.minOfArray(number);

        array.minOfArrayWithIndex(number);

        array.printEvenNumbers(number);

        System.out.println();

        array.printOddNumbers(number);

        System.out.println();

        array.printCountEvenNumbers(number);

        array.bubbleSort(number);

        array.bubbleSortRevers(number);

        System.out.println();
        array.sumOfOurArray(number);

        array.printArray(number);
    }
}

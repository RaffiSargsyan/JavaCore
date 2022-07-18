package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {8, 10, 22, 31, 19, 91, 11, 27, 6, 9};

        System.out.print("Մասիվի բոլոր էլեմենտները - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");

        }

        System.out.println();
        System.out.print('\n');

        System.out.print("Մասիվի ամենամեծ թիվը - ");
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }
        System.out.println(num);
        System.out.print('\n');


        System.out.print("Մասիվի ամենափոքրը թիվը - ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                num = array[i];
            }
        }
        System.out.println(num);
        System.out.print('\n');

        System.out.print("Մասիվի բոլոր զույգ էլեմենտները + քանակը - ");
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numbers++;
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println("Քանակը = " + numbers + "");

        numbers = 0;
        System.out.print('\n');

        System.out.print("Մասիվի բոլոր կենտ էլեմենտները + քանակը - ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                numbers++;
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println("Քանակը = " + numbers + "");

        numbers = 0;
        System.out.print('\n');

        System.out.print("Միջին թվաբանականը - ");
        double nums = 0;
        for (int i = 0; i < array.length; i++) {
            nums += array[i];
            numbers++;
        }
        System.out.println(nums / numbers);
        System.out.print('\n');

        int total = 0;
        for (int r = 0; r < array.length; r++) {
            total += array[r];
        }
        System.out.println("Բոլոր էլեմենտների գումարը - " + total);
    }
}


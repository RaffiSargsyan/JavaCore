package homework.arrayutil;

public class MethodArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};
        MethodArrayUtil findItems = new MethodArrayUtil();

        int maxNumber = findItems.findMaxNumber(array);
        System.out.println(maxNumber);

        System.out.println(findItems.arrayMin(array));

        findItems.evenNumbers(array);

        System.out.println();

        System.out.println(findItems.averageOfArray(array));

        int sumElement = findItems.sumElement(array);
        System.out.println(sumElement);

        findItems.bubbleSort(array);

        System.out.println();

        findItems.bubbleSortReverse(array);
    }
}

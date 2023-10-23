package homework.arraymethod;

public class MethodArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};
        MethodArrayUtil findItems = new MethodArrayUtil();

        System.out.println(findItems.findMaxNumber(array));

        System.out.println(findItems.arrayMin(array));

        findItems.evenNumbers(array);

        System.out.println();

        findItems.oddNumbers(array);

        System.out.println();

        int i = findItems.averageOfArray(array);
        System.out.println(i);

        int i1 = findItems.sumElement(array);
        System.out.println(i1);

        findItems.bubbleSort(array);

        System.out.println();

        findItems.bubbleSortReverse(array);
    }
}

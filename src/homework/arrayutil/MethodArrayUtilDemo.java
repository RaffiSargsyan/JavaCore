package homework.arrayutil;

public class MethodArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};
        MethodArrayUtil arru = new MethodArrayUtil();
        int maxVal = arru.arrayMax(array);
        System.out.println(maxVal);

        int minVal = arru.arrayMin(array);
        System.out.println(minVal);

        arru.evenNumber(array);
        System.out.println();

        arru.oddNumber(array);

        int average = arru.averagearray(array);
        System.out.println();
        System.out.println(average);


        int sumOfElements = arru.sumElement(array);
        System.out.println(sumOfElements);

        arru.bubbleSort(array);
        System.out.println();
        arru.bubbleSortReverse(array);


    }
}

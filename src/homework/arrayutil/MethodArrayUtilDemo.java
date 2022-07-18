package homework.arrayutil;

public class MethodArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {20, 40, -1, 0, 98, 8, 2, 3, 12, 3};
        MethodArrayUtil arru = new MethodArrayUtil();
        int maxval = arru.arrayMax(array);
        System.out.println(maxval);
        int minval = arru.arrayMin(array);
        System.out.println(minval);
        arru.evennumber(array);
        System.out.println();
        arru.oddnumber(array);

        int average = arru.averagearray(array);
        System.out.println();
        System.out.println(average);

        int sumelement = arru.sumelement(array);
        System.out.println(sumelement);
        arru.bubbleSort(array);
        System.out.println();
        arru.bubbleSortReverse(array);


    }
}

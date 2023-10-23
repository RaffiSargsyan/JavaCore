package homework.practiceExamples;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,7,8,9,6,6};
        int maxvalue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxvalue){
                maxvalue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + maxvalue);
        System.out.println("min index: " + minIndex);
    }
}

package classwork.dyamicarray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            int[] temp = new int[array.length + 10];
            for (int i = 0; i < size ; i++) {
                temp[i] = array[i];
            }
            array =  temp;
        }
        array[size] = value;
        size++;

    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

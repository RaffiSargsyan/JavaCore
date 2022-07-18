package homework.dynamicarray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            int[] temp = new int[array.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size++] = value;

    }

    boolean isEmpty() {
        if (array.length < 0) {
            return true;
        }
        return false;
    }

    int getByIndex(int index) {
        if (index > array.length) {
            return 0;
        }
        return array[index];
    }

    int getFirstIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            if (index == -1) {
                return 0;
            } else if (value == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    void set(int index,int value){
        for (int i = 0; i < array.length ; i++) {
            if (index == i){
                array[i] = value;
            }

        }
    }

    void delete(int index){
        for (int i = index +1; i < array.length ; i++) {
            array [i-1] = array[i];
        }
        size --;
    }

    void add(int index, int value){
        for (int i = index; i < array.length ; i++) {
            int temp = value;
            value = array[i];
            array[i] =temp;
        }
        size ++;

    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }

    }
}

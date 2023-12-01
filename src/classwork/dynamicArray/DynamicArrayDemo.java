package classwork.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.add(7);
        dynArray.add(9);
        dynArray.add(8);
        dynArray.add(2);
        dynArray.add(9);
        dynArray.add(23);
        dynArray.add(-1);
        dynArray.add(2);

        dynArray.print();
    }
}

package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.add(7);
        dynArray.add(3);
        dynArray.add(31);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(28);
        dynArray.print();
        dynArray.add(1, 30);
        dynArray.print();
        System.out.println(dynArray.getFirstIndexByValue(7));
        dynArray.deleteByIndex(0);
        dynArray.print();



    }
}

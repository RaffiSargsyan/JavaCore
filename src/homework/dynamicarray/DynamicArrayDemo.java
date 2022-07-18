package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.add(7);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(99);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(24);
        dynArray.add(24);
        dynArray.add(24);
        System.out.println(dynArray.isEmpty());
        System.out.println(dynArray.getByIndex(5));
        System.out.println(dynArray.getFirstIndexByValue(3));
        dynArray.set(10, 4000);
        dynArray.print();
        dynArray.add(10, 98);
        System.out.println();
        dynArray.print();
        dynArray.delete(10);
        System.out.println();
        dynArray.print();


    }
}

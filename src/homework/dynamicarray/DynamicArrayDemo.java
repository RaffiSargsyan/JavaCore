package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray2 dynArray = new DynamicArray2();
        dynArray.add(7);
        dynArray.add(3);
        dynArray.add(31);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(22);
        dynArray.add(2);
        dynArray.print();
        System.out.println(dynArray.getFirstIndexByValue(7));
        System.out.println(dynArray.getByIndex(0));
        System.out.println(dynArray.isEmpty());

        dynArray.set(0, 100);
        dynArray.print();
        dynArray.add(0, 9);
        dynArray.print();

        dynArray.deleteByIndex(2);
        dynArray.print();
//        dynArray.print();
//        dynArray.add(28);
//        dynArray.add(1);
//        dynArray.print();
//        System.out.println(dynArray.getFirstIndexByValue(7));
//        dynArray.deleteByIndex(0);
//        dynArray.print();


    }
}

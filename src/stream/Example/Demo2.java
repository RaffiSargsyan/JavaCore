package stream.Example;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //method forEach
        int[] array = {9, 2, 4, 1, 2, 5};
//        Arrays.stream(array).forEach(element -> {
//            element *= 2;
//            System.out.println(element);
//        });
//        Arrays.stream(array).forEach(el-> System.out.print(el));
        Arrays.stream(array)
                .forEach(System.out::print);

        Arrays.stream(array).forEach(Utils::myMethod);

        Arrays.stream(array).forEach(el -> Utils.myMethod(el));
    }

    class Utils {
        public static void myMethod(int a) {
            a = a + 5;
            System.out.println("Element " + a);
        }
    }
}

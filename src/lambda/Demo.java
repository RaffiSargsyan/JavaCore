package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        for (Integer x : numbers) {
//            System.out.print(x + " ");
//        }
        numbers.forEach(x -> System.out.print(x + " "));
    }
}

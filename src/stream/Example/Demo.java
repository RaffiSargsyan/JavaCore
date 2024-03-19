package stream.Example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you");
        list.add("Fine");
        list.add("Good");
//
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        System.out.println(list);

        //
        List<Integer> list1 = list.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(list1);

        int[] array = {1, 4, 2, 12, 19, 4, 3};

        int[] filteredArray = Arrays.stream(array)
                .filter(num -> num % 2 != 0)
                .toArray();

        System.out.println(Arrays.toString(filteredArray));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("How are you");
        set.add("Fine");
        set.add("Good");
        System.out.println(set);

        Set<String> set1 = set.stream()
                .map(String::toUpperCase)
                .collect(toSet());
        System.out.println();
    }
}

package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arpine");
        names.add("Amalia");
        names.add("Raffi");

        List<String> collect = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect);

        //to becoming uppercase without stream

//        List<String> result = new ArrayList<>();
//        for (String s : names) {
//            result.add(s.toUpperCase());
//        }
//        System.out.println(names);
//        System.out.println(result);
    }
}

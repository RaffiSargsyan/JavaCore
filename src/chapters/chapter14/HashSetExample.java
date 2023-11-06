package chapters.chapter14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("Mam");
        setString.add("Dad");
        setString.add("Sister");

        for (String s : setString) {
            System.out.println(s);
        }
        System.out.println("-----");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mam");
        linkedHashSet.add("Dad");
        linkedHashSet.add("Sister");

        for (String s : setString) {
            System.out.println(s);
        }
    }
}

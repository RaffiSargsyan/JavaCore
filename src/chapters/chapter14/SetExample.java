package chapters.chapter14;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("Hi");
        setString.add("Hello");
        setString.add(null);
//        setString.add("Hello"); it's duplicate

        for (String s : setString) {
            System.out.println(s);
        }
    }
}

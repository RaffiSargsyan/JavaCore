
package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SixthTask {
    public static void main(String[] args) {

        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();

        keyValue.put(1, "Hello");
        keyValue.put(2, "World");
        keyValue.put(3, "Have a nice day!");

        //while loop
        System.out.println("While loop");

        Iterator<Map.Entry<Integer, String>> iterator = keyValue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("Key is " + next.getKey() + " " + "Value is " + next.getValue());

        }
        //for loop
        System.out.println("for loop");
        for (Map.Entry<Integer, String> integerStringEntry : keyValue.entrySet()) {
            System.out.println("Key is " + integerStringEntry.getKey() + " " + "Value is " + integerStringEntry.getValue());
        }
    }
}
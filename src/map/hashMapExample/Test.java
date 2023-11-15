package map.hashMapExample;

import java.util.*;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(57, "Sos");
        hashMap.put(56, "Elianora");
        hashMap.put(27, "Arpine");
        hashMap.put(23, "Amalia");
        hashMap.put(null, "Raffi");
        hashMap.put(40, "Nata");


        System.out.println(hashMap);
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.get(27));

        //in our hashmap is contains this '21' Key
        System.out.println(hashMap.containsKey(21));


        //I changed the value to 23 and in two different ways
        hashMap.replace(23, "Amalia", "MyAmalia"); //I replaced,changed, value of 23,
        hashMap.replace(23, "DearAmalia");

        //I pass through with all values in third different ways
        Collection<String> values = hashMap.values();
        Iterator<String> valueOfHashMap = values.iterator();
        while (valueOfHashMap.hasNext()) {
            String next = valueOfHashMap.next();
            System.out.println(next + ": ");
        }
        Object[] objects = values.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i] + ":: ");
        }
        for (String x : values) {
            System.out.println(x + ":' ");
        }

        System.out.println(hashMap.get(23));
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("DearAmalia"));
        System.out.println(hashMap.isEmpty());
        hashMap.remove(null, "Raffi");

        System.out.println(hashMap);


//        iteration with for loop with function entrySet
        Set<Entry<Integer, String>> entries = hashMap.entrySet();
        for (Entry<Integer, String> x : entries) {
            System.out.println(x.getKey() + ", " + x.getValue() + ",");
        }

        //iteration with while loop
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> next = iterator.next();
            System.out.print(next + ", ");
        }
        System.out.println("-----\n");


//        iteration with for loop with function keySet
        Set<Integer> keys = hashMap.keySet();
        for (Integer key : keys) {
            System.out.println(key);
            System.out.println(key + ", " + hashMap.get(key));
        }
    }
}

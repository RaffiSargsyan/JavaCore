package collectionAndMap.map.hashTable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>(10, 0.75f);
        hashTable.put(10, "Maradona");
        hashTable.put(10, "Messi");
        hashTable.put(8, "Iniesta");
        hashTable.put(9, "Villa");
//        hashTable.put(null,"Pedro");  key and value cannot be null in HashTable
        System.out.println(hashTable);

        Enumeration<Integer> keys = hashTable.keys();

        Iterator<Integer> integerIterator = keys.asIterator();
        while (integerIterator.hasNext()) {
            Integer next = integerIterator.next();
            System.out.print(next + " ");
        }

        System.out.println();

        Enumeration<String> elements = hashTable.elements();
        Iterator<String> iterator = elements.asIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Map.Entry<Integer, String>> entries = hashTable.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> next = iterator1.next();
            System.out.println("key " + next.getKey() + " " + next.getValue());
        }

        System.out.println(hashTable.size());

    }
}

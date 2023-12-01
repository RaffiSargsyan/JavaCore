package collectionAndMap.set.hashSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Demonstrate {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Water");
        hashSet.add("Coffee");
        hashSet.add("Tea");
        hashSet.add("Milk");
        hashSet.add("Cocoa");
        hashSet.add("Milk");
//        hashSet.add(null);
//        hashSet.add(null);
        //will be replaced all duplicates in HashSet

        //our add method will be become put in HashMap and Value will be become Dummy object

        hashSet.remove("Milk");
        System.out.println(hashSet);

        for (String x : hashSet) {
            System.out.print(x + " ");
        }
        HashSet<String> myHashSet = new HashSet<>(12, 0.75f);
        myHashSet.add("World");
        myHashSet.add("Family");
        hashSet.addAll(myHashSet);

        System.out.println(hashSet);

    }
}

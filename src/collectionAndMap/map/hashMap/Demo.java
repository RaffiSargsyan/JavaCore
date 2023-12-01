package collectionAndMap.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1020, "Sos Sargsyan");
        map.put(4421, "Elianora Sargsyan");
        map.put(2421, "Arpine Sargsyan");
        map.put(100, "Raffi Sargsyan");
        map.put(null, "Anna Sargsyan");

        map.putIfAbsent(242, "Amalia Hakobyan");
        System.out.print(map);

        System.out.println();
        System.out.println(map.get(242));

        map.remove(1000);

        System.out.println(map);

        System.out.println(map.containsValue("Anna Sargsyan"));

        System.out.println(map.containsKey(null));

//        //keySet
        Set<Integer> set = map.keySet();
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == null)
                continue;
            if (next  > 1000) {
                System.out.println(next);
            }
        }
    }
}

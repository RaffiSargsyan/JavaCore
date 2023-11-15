package map.createMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human {
    private int key;
    private String value;

    public Human(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String
    toString() {
        return "Human{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}

class MyMap {
    List<Human> humans;

    public void put(Integer key, String value) {
        humans.add(new Human(key, value));
    }

    public static void main(String[] args) {

        List<Human> as = new ArrayList<>(Collections.singleton(new Human(1, "Abc")));
//        Human human = new Human(12, "Ab");
//        System.out.println(human);
        System.out.println(as.get(0));
    }
}

package collection.exampleTreeSet;

import java.util.Comparator;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(Human o) {
//        return this.age - o.age;
//    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }
//
//    @Override
//    public int compare(Human o1, Human o2) {
//        return 0;
//    }

//    @Override
//    public int compare(Human obj1, Human obj2) {
//        return obj1.age - obj2.age;
//    }
}

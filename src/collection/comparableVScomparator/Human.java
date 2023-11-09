package collection.comparableVScomparator;

import java.util.Comparator;

public class Human implements Comparator<Human> {
    private String name;
    private int age;
    private int salary;

    Human() {

    }

    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "{" + name + ", " + age + ", " + salary + "}";
    }

//    @Override
//    public int compareTo(Human obj) {
//        if (this.age > obj.age)
//            return 9;
//        if (this.age < obj.age)
//            return -8;
//        return 0;

//        return this.age - obj.age; //another variant
//    }

    @Override
    public int compare(Human o1, Human o2) {
        return 0;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


//    @Override
//    public int compareTo(Human o) {
//        return this.name.compareTo(o.name);
//    }
}

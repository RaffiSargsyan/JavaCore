package collectionAndMap.list.binarySearch;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ']';
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
    public int compareTo(Student obj) {
//        if (this.age > obj.age)
//            return 1;
//        if (this.age < obj.age)
//            return -1;
//        return 0;
        return this.age - obj.age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amalia", 25);
        Student s2 = new Student("Mary", 20);
        Student s3 = new Student("Lucy", 18);
        Student s4 = new Student("Lucy", 34);
        Student s5 = new Student("Lucy", 12);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.max(list));

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.min(list));

//        Collections.reverse(list);
//        System.out.println(list);

//        int index = Collections.binarySearch(list, new Student("Lucy", 12));
//        System.out.println(index);
    }
}


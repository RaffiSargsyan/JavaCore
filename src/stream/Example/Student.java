package stream.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark;
    }

    public static void main(String[] args) {

        //method filter
        Student s1 = new Student("Arpine", 27, 9.1);
        Student s2 = new Student("Amalia", 22, 3.1);
        Student s3 = new Student("Raffi", 25, 1.1);
        Student s4 = new Student("Elianora", 55, 9.9);
        List<Student> studentList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));

//        List<Student> collect = studentList.stream()
//                .filter(element -> element.getAge() > 30 && element.getMark() >2.2)
//                .toList();
//        System.out.println(collect);

        Stream<Student> myStream = Stream.of(s1, s2, s3, s4);
        myStream.filter(element -> element.getAge() > 30 && element.getMark() > 2.2)
                .collect(Collectors.toList());
    }
}

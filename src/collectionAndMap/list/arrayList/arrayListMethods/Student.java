package collectionAndMap.list.arrayList.arrayListMethods;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String name;
    private char gender;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char gender, int age, int course, double avgGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gender == student.gender && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, course, avgGrade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arpine", 'f', 27, 1, 7.2);
        Student s2 = new Student("Amalia", 'f', 22, 2, 9.2);
        Student s3 = new Student("Raffi", 'm', 25, 4, 1.1);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        Student s4 = new Student("Raffi", 'm', 25, 4, 1.1);
        studentArrayList.remove(s4);
        System.out.println(studentArrayList);
        System.out.println(s4.equals(s3));
    }
}

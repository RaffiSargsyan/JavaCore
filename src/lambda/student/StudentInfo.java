package lambda.student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Amalia", 23, true);
        Student st2 = new Student("Arpine", 27, true);
        Student st3 = new Student("Raffi", 25, true);
        Student st4 = new Student("Lucy", 30, false);

        ArrayList<Student> students = new ArrayList<>(Arrays
                .asList(st1, st2, st3, st4));
        System.out.println(students);

        StudentInfo info = new StudentInfo();
        info.printAnOldestStudent(students, 29);

        System.out.println("--------");
        info.printOnlyArmenian(students,true,25);
    }

    void printAnOldestStudent(ArrayList<Student> str, int objAge) {
        for (Student s : str) {
            if (s.getAge() > objAge) {
                System.out.println(s);
            }
        }
    }

    void printOnlyArmenian(ArrayList<Student> str1, boolean b,int age) {

        for (Student s : str1) {
            if (s.isArmenian() && s.getAge() < 25)
                System.out.println(s);
        }
    }
}

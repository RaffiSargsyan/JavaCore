package chapters.chapter2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class A {
    public static final String UNIVERSITY_OF_STUDENT = "YSU";
    private String name;
    private static int year;
    public static int count;

    public A() {
        count++;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        A.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static int z;

    static {
        z = 0;
        System.out.println("I set value of 'z'");
        System.out.println(z);
    }

    public static void sum(int x, int y) {
//        System.out.println(name);
        System.out.println(x + y);
    }

    public static void main(String[] args) throws IOException {
        A a1 = new A();
        A a2 = new A();
        a1.name = "Raffi";
        a2.name = "Amalia";
        a1.sum(10, 21);
        a2.sum(10, 21);

        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        A a12 = new A();
        A a21 = new A();
        System.out.println(A.UNIVERSITY_OF_STUDENT);
        System.out.println(Integer.MAX_VALUE);
//        System.out.println("Общее количество: " + A.count);
//        FileWriter fileWriter = new FileWriter("count.txt");
//
//        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            writer.write(String.valueOf(A.count));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        FileReader fileReader = new FileReader("count.txt");
//        try (BufferedReader reader = new BufferedReader(fileReader)) {
//            String line = reader.readLine();
//            if (line != null) {
//                A.count = Integer.parseInt(line);
//                System.out.println("Считанное значение из файла: " + A.count);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String s = "123asdaAsqwqwe";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isLetter(s.charAt(i))) {
//                count++;
//            }
//
//        }
//        System.out.println(count);
    }
}



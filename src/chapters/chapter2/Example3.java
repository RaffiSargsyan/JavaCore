package chapters.chapter2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example3 {
    public static final String UNIVERSITY_OF_STUDENT = "YSU";
    private String name;
    private static int year;
    public static int count;

    public Example3() {
        count++;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Example3.year = year;
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
        Example3 a1 = new Example3();
        Example3 a2 = new Example3();
        a1.name = "Raffi";
        a2.name = "Amalia";
        a1.sum(10, 21);
        a2.sum(10, 21);

        Example3 a3 = new Example3();
        Example3 a4 = new Example3();

        System.out.println(Example3.UNIVERSITY_OF_STUDENT);

        System.out.println("Total: " + Example3.count);

        FileWriter fileWriter = new FileWriter("count.txt");

        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(String.valueOf(Example3.count));
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = new FileReader("count.txt");
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String line = reader.readLine();
            if (line != null) {
                Example3.count = Integer.parseInt(line);
                System.out.println("Count of our objects = " + Example3.count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



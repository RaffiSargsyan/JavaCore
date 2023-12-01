package chapters.chapter14;

import homework.fileExample.fileExample.ioExample.serialization.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();

        //Only for Integer class
        intStorage.add(12);
        LinkedList<String> linkedList = new LinkedList<>();

        ArrayList<String> arrayList = new ArrayList<>();

        //only for String...
        Storage<String> strStorage = new Storage<>();
        strStorage.add("only String");
        String str = strStorage.getByIndex(0);


        Storage<Student> studentStorage = new Storage<>();
        studentStorage.add(new Student("Amalia", "Hakobyan", 25, "amalia@gmail.com"));


        Student student = studentStorage.getByIndex(0);
    }
}

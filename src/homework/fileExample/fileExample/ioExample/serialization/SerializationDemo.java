package homework.fileExample.fileExample.ioExample.serialization;

import java.io.*;

public class SerializationDemo {
    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //for writing student object to file

        Student student = new Student("Amalia", "Hakobyan", 23, "amalia@gmail.com");

//        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object readObject = objectInputStream.readObject();
        Student student1 = (Student) readObject;
        System.out.println(student1);

    }
}


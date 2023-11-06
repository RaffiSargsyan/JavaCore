package homework.fileExample.fileExample.ioExample.file;

import java.io.*;

public class DataIOStream {
    private static final String FILE_PATH = "C:/Users/Asus/IdeaProjects/JavaCore/src/homework/fileExample/fileExample/ioExample/file/example.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
        DataOutputStream out = new DataOutputStream(fileOut);

        out.writeInt(543);
        out.writeBoolean(true);

        out.close();
    }

    private static void read() throws IOException {
        FileInputStream fileIo = new FileInputStream(FILE_PATH);
        DataInputStream input = new DataInputStream(fileIo);

        System.out.println(input.readInt());
        System.out.println(input.readBoolean());


        input.close();
    }
}

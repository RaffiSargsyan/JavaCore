package homework.fileExample.myExample;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("my.txt");
        DataOutputStream dataOut = new DataOutputStream(fileOut);

        dataOut.writeInt(12);
        dataOut.writeBoolean(true);
        dataOut.close();
    }

    private static void read() throws IOException {
        FileInputStream fileIo = new FileInputStream("my.txt");
        DataInputStream dataIo = new DataInputStream(fileIo);

        System.out.println(dataIo.readInt());
        System.out.println(dataIo.readBoolean());
        dataIo.close();
    }
}

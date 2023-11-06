package homework.fileExample.fileExample.ioExample.file;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "C:/Users/Asus/IdeaProjects/JavaCore/src/homework/fileExample/fileExample/ioExample/file/forString.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        try (BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write("Hello Mam\n");
            bw.write("Hello Everyone\r");
            bw.write("How are you ?\n");
            bw.write("Amalia\n");
            bw.write("Amalia\n");
        }
    }

    private static void read() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        try (BufferedReader bwRead = new BufferedReader(fileReader)) {
//            String line = "";
//            while ((line = bwRead.readLine()) != null) {
//                System.out.println(line);
//            }

            int c;
            int aCount = 0;
            while ((c = bwRead.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("aCount = " + aCount);
//            System.out.println(bwRead.read());
//            System.out.println(bwRead.read());
//            System.out.println(bwRead.read());
//            System.out.println(bwRead.read());
        }
    }
}

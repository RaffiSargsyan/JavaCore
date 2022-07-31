//package classwork.lesson22.fileExample.fileExample.ioExample.file;
//
//
//import org.omg.CORBA.DataOutputStream;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class DataIOStream {
//    private static final String FILE_PATH = "C:\\Users\\Raf\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\fileExample\\ioExample\\file\\example.txt";
//
//    public static void main(String[] args) throws IOException {
//        write();
//        read();
//
//    }
//
//    public static void write() throws IOException {
//        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
//
//        out.writeInt(33);
//        out.write_boolean(false);
//        out.close();
//
//    }
//}
//
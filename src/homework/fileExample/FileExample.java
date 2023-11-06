package homework.fileExample;

import java.io.*;

public class FileExample {

    static String filepath = "C:/Users/Asus/IdeaProjects/JavaCore/src/homework/fileExample/testFolder/test2Folder";


    public static void main(String[] args) throws IOException {
        File myFile = new File(filepath);
//        String os = System.getProperty("os.name").toLowerCase();
//        System.out.println(os);


        File[] files = myFile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        for (File file : files) {
            System.out.println(file.getName());
        }


//        File myfile = new File(filepath);
//        File myFile2 = new File(newFilepath);
//
//        myFile2.renameTo(new File(filepath));

//        boolean b = myfile.renameTo(new File(newFilepath));
//        System.out.println(b);
//        System.out.println("Users" + File.separator + "Raffi");


//        System.out.println(myfile.exists());
//        if (!myfile.exists()) {
//            myfile.createNewFile();
//            System.out.println(myfile.exists());
//        }
//        System.out.println("isDirectory " + myfile.isDirectory());
//        System.out.println("isFile " + myfile.isFile());
//
//        if (myfile.isDirectory()) {
//            File[] files = myfile.listFiles();
//            for (File file : files) {
//                System.out.println(file + " ");
//            }
//            for (File file : files) {
//                if (file.isDirectory())
//                    System.out.println(file.getName());
//            }
//
//        }
//        System.out.println(myfile.getFreeSpace());
//        System.out.println(myfile.getTotalSpace());
//        System.out.println(myfile.isHidden());
//        System.out.println(myfile.mkdirs());
    }
}

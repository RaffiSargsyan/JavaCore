package homework.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    static String path = "C:\\Users\\Raf\\IdeaProjects\\JavaCore22";

    public static void main(String[] args) throws IOException {
        fileSearch();
        //contentSearch();
//        findLines();
        // printSizeOfPackage();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Input folder name");
        String folderName = scanner.nextLine();
        System.out.println("Input file name");
        String filename = scanner.nextLine();

        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().equals(folderName)) {
                    file = new File(folderName);
                    if (file.isDirectory()) {
                        File[] scannerFolder = file.listFiles();
                        for (File file2 : scannerFolder) {
                            if (file2.getName().equals(filename)) {
                                file = new File(file.getAbsolutePath(), filename);
                                System.out.println(file.exists());
                            }
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Input keyword");
        String keyword = scanner.nextLine();

        File folder = new File(path);

        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        boolean exists = false;
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                exists = true;
                            }
                        }
                        if (!exists) {
                            System.out.println("no file");
                        }
                    }
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        File folderPath = new File(path);
        File[] files = folderPath.listFiles();
        System.out.println("path.txt");
        if (files != null) {
            String getPathTxtFormat;
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    getPathTxtFormat = file.getAbsolutePath();
                    System.out.println(getPathTxtFormat);
                    System.out.println("Input file path for format .txt");
                    String filePathTxt = scanner.nextLine();
                    System.out.println("Input keyword");
                    String keyword = scanner.nextLine();
                    if (filePathTxt.equals(getPathTxtFormat)) {
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                if (!line.contains(keyword)) {
                                    continue;
                                }
                                System.out.println(line);
                            }
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Input path for size folder");
        String pathFolderSize = scanner.nextLine();
        File folderfile = new File(path);
        File[] Files = folderfile.listFiles();
        long size = 0;
        if (Files != null) {
            for (File allFile : Files) {
                if (allFile.getName().equals(pathFolderSize)) {
                    folderfile = new File(pathFolderSize);
                    Files = folderfile.listFiles();
                    if (allFile.isDirectory()) {
                        for (File file : Files) {
                            size += file.length();
                        }
                        System.out.println(size + " byte");
                    }
                }
            }
            if (size == 0) {
                System.out.println("Invalid package name");
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

    }

}

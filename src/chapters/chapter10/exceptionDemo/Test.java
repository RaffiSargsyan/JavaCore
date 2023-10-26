package chapters.chapter10.exceptionDemo;

import chapters.chapter9.test2.IFTest;

public class Test {
    public static void main(String[] args) {
        try {
            printWithoutSpace(null);
        } catch (Exception e) {
            System.out.println("Good");
        }
    }

    static void printWithoutSpace(String str) throws Exception {
        if (str == null) {
            throw new Exception("Str is null");
        }
        System.out.println(str.trim());
    }
}
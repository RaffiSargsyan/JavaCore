package chapters.chapter7.stringExample;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "First line";
        String str2 = "Second line";
        String str3 = str;

        System.out.println("The length of str = " + str.length());

        System.out.println("Symbol with index = " + str2.charAt(5));

        if (str.equals(str2)) {
            System.out.println("str == str2");
        } else {
            System.out.println("str != str2");
        }
        if (str.equals(str3)) {
            System.out.println("str == str3");
        } else {
            System.out.println("str != str3");
        }
    }
}

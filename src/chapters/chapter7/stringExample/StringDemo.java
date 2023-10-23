package chapters.chapter7.stringExample;

public class StringDemo {
    public static void main(String[] args) {
        String str = "First line";
        String str2 = "Second line";
        String str3 = str + " and " + str2;
        System.out.println(str3);

        System.out.println(str.concat(str2));

        StringBuilder strB = new StringBuilder("Hello ");
        StringBuilder strB1 = new StringBuilder("World");

        System.out.println(strB.append(strB1));


        System.out.println(str);
        System.out.println(str2);

    }
}

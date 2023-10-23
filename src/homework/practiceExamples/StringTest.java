package homework.practiceExamples;

public class StringTest {
    public static void main(String[] args) {
        String name = " Arpine Sargsyan ";

        System.out.println(name.trim());   //it's back me name without space
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String[] s = name.split(" ");
        System.out.println(s[1]);
        System.out.println(s[2]);
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}

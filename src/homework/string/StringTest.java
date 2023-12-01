package homework.string;

public class StringTest {
    public static void main(String[] args) {
        String name = "Charles Aznavour";
        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                result += "a".toUpperCase();
            } else {
                result += chars[i];
            }
        }
        System.out.println(result);
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
    }
}




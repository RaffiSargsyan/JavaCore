package collection.stack;

public class ReverseStringWithoutStack {
    public static void main(String[] args) {
        String originalString = "Amalia";

        String reversedString = reverseStringWithoutStack(originalString);


        System.out.println("At first -" + originalString);
        System.out.println("Then this String -" + reversedString);
    }

    private static String reverseStringWithoutStack(String input) {
        char[] charArray = input.toCharArray();


        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);
    }
}

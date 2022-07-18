package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;

        while (firstIndex < lastIndex && spaceArray[lastIndex] == ' ') {
            lastIndex--;

        }
        while (firstIndex < lastIndex && spaceArray[firstIndex] == ' ') {
            firstIndex++;
        }

        char[] result = new char[(lastIndex - firstIndex) + 1];
        int index = 0;
        for (int i = firstIndex; i < lastIndex + 1; i++) {
            result[index++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}

package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'A', 'm', 'a', ' ', ' ', 'l', 'i', 'a', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex = startIndex + 1;
            } else {
                break;
            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }

        }

        char[] result = new char[endIndex - startIndex + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.println(c);
        }


    }
}

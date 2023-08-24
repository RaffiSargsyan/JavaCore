public class SpaceArrayExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'A', 'm', 'a', ' ', ' ', 'l', 'i', 'a', ' ', ' '};

        System.out.println("Original spaceArray: " + new String(spaceArray));

        int length = spaceArray.length;

        // Find the first non-space character
        int startIndex = 0;
        while (startIndex < length && spaceArray[startIndex] == ' ') {
            startIndex++;
        }

        // Find the last non-space character
        int endIndex = length - 1;
        while (endIndex >= 0 && spaceArray[endIndex] == ' ') {
            endIndex--;
        }

        // Calculate the size of the result array
        int resultSize = endIndex - startIndex + 1;
        char[] resultArray = new char[resultSize];

        // Copy the non-space characters to the result array
        for (int i = startIndex; i <= endIndex; i++) {
            resultArray[i - startIndex] = spaceArray[i];
        }

        System.out.println("Modified spaceArray: " + new String(resultArray));
    }
}

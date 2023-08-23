package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] charArray = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
            }
        }
        System.out.println("count = " + count);

        int middleIndex = charArray.length / 2;
        System.out.println("middle index = " + charArray[middleIndex]);

        int lastIndex = charArray.length - 1;
        boolean eoResult = false;
        if (charArray[lastIndex] == 'e' && charArray[lastIndex - 1] == 'v') {
            eoResult = true;
        }
        System.out.println("eoResult = " + eoResult);

        char[] bobArray = {'j', 'x', 'v', 'j', 'l', 'o', 'v', 'b'};

        boolean bobThere = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;
            }
        }
        System.out.println("I find bob there ---> " + bobThere);

        char[] chars1 = {' ', ' ', ' ', 'j', 'a', 'v', 'a', ' ', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != ' ') {
                System.out.print(chars1[i] + " ");
            }
        }
        System.out.println();
        for (char c1 : chars1) {
            if (c1 != ' ') {
                System.out.print(c1 + " ");
            }
        }
    }

}


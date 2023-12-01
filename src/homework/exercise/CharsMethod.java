package homework.exercise;

public class CharsMethod {


    public void countOfA(char[] chars) {
        char c = 'a';
        int countOfA = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countOfA++;
            }
        }
        System.out.println(countOfA);
    }

    public void middleIndex(char[] chars) {
        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex - 1]);
        System.out.println(chars[middleIndex]);
    }

    public boolean isLastIndexAorI(char[] chars) {
        int i1 = chars.length - 1;
        boolean isResult = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i1] == 'A' && chars[i1 - 1] == 'I') {
                isResult = true;
            }
        }
        return isResult;
    }

    public void printWithoutSpace(char[] chars) {
        for (char aChar : chars) {
            if (aChar != ' ') {
                System.out.print(aChar);
            }
        }
    }

    public void textIsThere(char[] chars) {
        boolean amaThere = false;
        for (int i = 0; i < chars.length - 3; i++) {
            if (chars[i] == 'a' && chars[i + 3] == 'a') {
                amaThere = true;
                break;
            }
        }
        System.out.println("amaThere -> " + amaThere);
    }

    public static void main(String[] args) {
        CharsMethod charsMethod = new CharsMethod();
        char[] chars = {'A', 'm', 'a', 'l', 'i', 'a'};

        charsMethod.countOfA(chars);

        charsMethod.middleIndex(chars);

        System.out.println(charsMethod.isLastIndexAorI(chars));

        charsMethod.printWithoutSpace(chars);

        System.out.println();

        charsMethod.textIsThere(chars);
    }
}

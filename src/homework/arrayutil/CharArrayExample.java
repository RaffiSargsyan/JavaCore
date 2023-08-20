package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int symbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                symbol++;
            }
        }

        System.out.println("There is " + symbol + " symbol ");
        System.out.println();

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };

        System.out.print(chars2[chars2.length / 2 - 1] + " and ");
        System.out.print(chars2[chars2.length / 2]);

        System.out.println("\n");

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println("'l' 'y'- True: ");
        } else {
            System.out.println("'l' 'y'- False");
        }

        System.out.println();

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");


            }
        }
//        System.out.println();
//        char[] charIndex = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e', 'o' };


//        char c = 'o';
//        int count = 0;
//        for (int i = 0; i < charIndex.length; i++) {
//            if (charIndex[i] == 'o') {
//                count = count + 1;    //or count ++
//            }
//        }
//        System.out.println(count);


//        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] != ' ') {

//                System.out.print(text[i]);
//            }

//        }
//        System.out.println();


    }
}


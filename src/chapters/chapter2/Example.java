package chapters.chapter2;


public class Example {
    public static void main(String[] args) {
        System.out.println("Hi,Mom");

        String s = "123oneTwoThree";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }

        }
        System.out.println("Is letter in our String = " + count);
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count1++;
            }


        }
        System.out.println("Digits in String is = " + count1);

        int count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count3++;
            }
        }
        System.out.println("UpperCase symbols is = " + count3);
    }
}

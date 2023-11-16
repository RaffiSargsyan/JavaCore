package homework.type.array;

public class Test {
    public static void main(String[] args) {
        String[] array;                     //dynamic initialization
        array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = "Hello" + i;
            System.out.println(array[i]);
        }
        String[] array2;
        array2 = new String[3];
        array2[0] = "How do you feel";
        array2[1] = "I feel well";
        array2[2] = "And you ?";
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}

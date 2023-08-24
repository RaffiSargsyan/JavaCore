package chapters.chapter5;

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) break;//go out from cycle when value -i equals 10
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("cycle stopped");
        System.out.println("\n");


        int j = 0;
        while (j < 20) {
            if (j == 10)
                break;
            System.out.println("j = " + j);
            j++;
        }
        System.out.println("cycle stooped again");
    }
}

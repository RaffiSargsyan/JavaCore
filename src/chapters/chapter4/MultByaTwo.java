package chapters.chapter4;

public class MultByaTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

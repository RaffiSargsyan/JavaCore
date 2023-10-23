package chapters.chapter5.keywordBreak;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i == 10) break; //here we say that we to want stopped loop
            System.out.println("i = " + i);

        }
        System.out.println("loop stopped");
    }
}

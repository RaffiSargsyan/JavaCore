package homework.bracechacker;

public class BraceCheckerDemo {


    public static void main(String[] args) {

        String text = "Hello (from}  [java]{{{{";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}


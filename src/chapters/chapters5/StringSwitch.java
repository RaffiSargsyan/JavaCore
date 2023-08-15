package chapters.chapters5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one" -> System.out.println("one");
            case "twwo" -> System.out.println("two");
            case "three" -> System.out.println("three");
            case "four" -> System.out.println("four");
            default -> System.out.println("cannot find");
        }
    }
}

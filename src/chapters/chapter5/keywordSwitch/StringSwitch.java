package chapters.chapter5.keywordSwitch;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "four";
//        switch (str) {
//            case "one" -> System.out.println("one");
//            case "two" -> System.out.println("two");
//            case "three" -> System.out.println("three");
//            case "four" -> System.out.println("four");
//            default -> System.out.println("cannot find");
//        }
        switch (str) {
            case "one":
                System.out.println("find one");
                break;
            case "two":
                System.out.println("find two");
                break;
            case "three":
                System.out.println("find three");
            case "four":
                System.out.println("find four");

        }
    }
}

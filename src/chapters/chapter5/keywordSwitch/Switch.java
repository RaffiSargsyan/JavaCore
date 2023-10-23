package chapters.chapter5.keywordSwitch;

public class Switch {
    public static void main(String[] args) {
        int month = 5;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Autumn";
                break;
            default:
                season = "other season";
        }
        System.out.println("May refers is " + season);
    }
}

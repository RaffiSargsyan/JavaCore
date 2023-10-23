package chapters.chapter5.operatorIf;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season = null;
        if (month == 4 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 11 || month == 5) {
            season = "Spring !!";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 12) {
            season = "Autumn";
        } else {
            season = "Uups,not this month";
        }
        System.out.println("May refers to " + season);
    }
}


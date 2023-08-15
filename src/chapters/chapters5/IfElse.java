package chapters.chapters5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int month = 3;
        String season = null;
        if (month == 12 || month == 1 || month == 2) {
            season = "зима";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "весна";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "осень";
        } else if (month == 9 || month == 10 || month == 12) {
            season = "зима";
        } else {
            season = "вымышленным месяцам";
        }
        System.out.println("Декабрь относится к " + season);
    }
}

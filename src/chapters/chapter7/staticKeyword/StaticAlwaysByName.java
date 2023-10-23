package chapters.chapter7.staticKeyword;

public class StaticAlwaysByName {
    static int a = 43;
    static int b = 99;

    static void callMe() {
        System.out.println("a " + a);
    }

    public static void main(String[] args) {
        StaticAlwaysByName.callMe();
        System.out.println("b = " + StaticAlwaysByName.b);
    }
}

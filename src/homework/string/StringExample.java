package homework.string;

public class StringExample {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append("Amalia");
            result.append(i);
            result.append(" ");
        }
        System.out.println(result);
    }
}
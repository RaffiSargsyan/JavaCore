package practice;

public class FirstTask {
    public static void main(String[] args) {

        String str = "TaskOne";

        StringBuilder builder = new StringBuilder();
        StringBuilder reverse = builder.append(str).reverse();

        System.out.println(reverse);

    }
}
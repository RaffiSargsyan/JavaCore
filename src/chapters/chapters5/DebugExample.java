package chapters.chapters5;

public class DebugExample {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Breakpoint set here
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
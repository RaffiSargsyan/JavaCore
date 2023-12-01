package practice;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Enter values a and b");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter value of 'a' ");
        a = scanner.nextInt();
        System.out.println("And now please enter value of 'b' ");
        b = scanner.nextInt();

        System.out.println("Before exchanging values");
        System.out.print(a + " and " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println();
        System.out.println("After exchanging values " + a + " and " + b);

    }
}
package chapters.chapter2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Example... (2 + 3, 10 * 5, etc.):");

        String input = scanner.nextLine();


        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please use the format: operand1 operator operand2");
            return;
        }

        double operand1 = Double.parseDouble(parts[0]);
        char operator = parts[1].charAt(0);
        double operand2 = Double.parseDouble(parts[2]);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0 && operand1 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Division by zero is not correct.");
                    return;
                }
                break;
            default:
                System.out.println("Oops! You can only use with numbers +, -, *, /");
                input = scanner.nextLine();
                return;
        }

        System.out.println("Result = " + result);
    }
}

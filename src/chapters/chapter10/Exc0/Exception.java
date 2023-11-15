package chapters.chapter10.Exc0;

import java.io.IOException;

public class Exception {

    public static void main(String[] args) {
        String num = "12m";


        try {
            int numbers = Integer.parseInt(num);
        } catch (NumberFormatException e) {

            System.out.println("Please input only numbers");
        }

        String email = "raffi.@com";
        try {
            checkEmail(email);
            System.out.println("email is correct");
        } catch (IOException e) {
            System.out.println("wrong email");
        }
        System.out.println("end of program");
    }

    static void checkEmail(String email) throws IOException {
        if (!email.contains("@")) {
            throw new IOException();
        }
        System.out.println("Sending email...");
    }
}

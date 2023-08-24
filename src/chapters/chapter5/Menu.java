package chapters.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Operation help :");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.while");
            System.out.println("4.do-while");
            System.out.println("5.for\n");
            System.out.println("Select the item you want :");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if :\n");
                System.out.println("if(condition) Operator;");
                System.out.println("else Оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("case constant:");
                System.out.println("succession of orators");
                System.out.println("break");
                System.out.println("// ...");
                System.out.println("}");
            case '3':
                System.out.println("while:\n");
                System.out.println("while (condition) Operator;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("Operator;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(initialization; condition; iteration)");
                System.out.println("Operator;");
                break;
        }
    }
}


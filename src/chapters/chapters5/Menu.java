package chapters.chapters5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Справка по опературу:");
            System.out.println("    1.if");
            System.out.println("    2.switch");
            System.out.println("    3.while");
            System.out.println("    4.do-while");
            System.out.println("    5.for\n");
            System.out.println("Выберите нужный пункт:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if :\n");
                System.out.println("if(условие) Оператор;");
                System.out.println("else Оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("case константа:");
                System.out.println("последовалность орераторов");
                System.out.println("break");
                System.out.println("// ...");
                System.out.println("}");
            case '3':
                System.out.println("while:\n");
                System.out.println("while (условие) Оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("    Оператор;");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(иницилизация; условие; итерация)");
                System.out.println("  Оператор;");
                break;
        }


    }
}


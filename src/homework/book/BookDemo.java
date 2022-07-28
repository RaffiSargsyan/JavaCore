package homework.book;

import homework.book.models.Author;
import homework.book.models.Book;
import homework.book.models.Registration;
import homework.book.storage.AuthorStorage;
import homework.book.storage.BookStorage;
import homework.book.storage.UserStorage;

import java.util.Scanner;

import static sun.misc.Version.print;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) {
        Author Silva = new Author("Silva", "Kaputikyan", "@silva", "female");
        Author Hovhannes = new Author("Hovhannes", "Tumanyan", "@hovtum", "male");
        Author Tereza = new Author("Tereza", "Numa", "@numa", "female");
        Author Sevak = new Author("Sevak", "Paruyr", "@sevak", "male");

        authorStorage.add(Silva);
        authorStorage.add(Hovhannes);
        authorStorage.add(Tereza);
        authorStorage.add(Sevak);
        bookStorage.add(new Book("Lirika", Silva, 20.2, 100, "Poems and Poetry"));
        bookStorage.add(new Book("Giqor", Hovhannes, 10, 50, "Drama"));
        bookStorage.add(new Book("The Memorial", Tereza, 23, 40, "Drama"));
        bookStorage.add(new Book("Entry", Sevak, 35, 44, "Poems"));


        boolean run = true;
        while (run) {
            Commands.printLoogRek();
            int command = 0;

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
            if (command == REGISTRATION) {
                reguser();
            }
            if (command == LOGIN) {
                loginuser();

                while (userStorage.getSize() != 0) {
                    Commands.printCommand();
                    int inercommand = Integer.parseInt(scanner.nextLine());
                    switch (inercommand) {
                        case EXIT:
                            run = false;
                            break;
                        case 1:
                            addBook();
                            break;
                        case 2:
                            bookStorage.print();
                            break;
                        case 3:
                            System.out.println("Input author name");
                            String name = scanner.nextLine();
                            bookStorage.printBookByAuthorName(name);
                            break;
                        case 4:
                            System.out.println("Input BookGener");
                            String gener = scanner.nextLine();
                            bookStorage.printBookByGener(gener);
                            break;
                        case 5:
                            System.out.println("Input FirstBookPrice");
                            double firstPrice = Double.parseDouble(scanner.nextLine());
                            System.out.println("Input SecondBookPrice");
                            double secondprice = Double.parseDouble(scanner.nextLine());
                            bookStorage.printBookByPriceRange(firstPrice, secondprice);
                            break;
                        case 6:
                            authorStorage.print();
                            break;
                        case 7:
                            addAuthor();
                            break;
                        case 8:
                            System.out.println("Input author index for print author");
                            int authorIndex = Integer.parseInt(scanner.nextLine());
                            authorStorage.printAuthorByIndex(authorIndex);

                            break;


                    }
                }
            }

        }


    }

    private static void loginuser() {
        System.out.println("Input login");
        String log = scanner.nextLine();
        System.out.println("Input password");
        String pass = scanner.nextLine();

        userStorage.login(log, pass);
    }

    private static void reguser() {

        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input surname");
        String sname = scanner.nextLine();
        System.out.println("Input age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Login");
        String log = scanner.nextLine();
        System.out.println("Input password");
        String pass = scanner.nextLine();

        Registration registration = new Registration(name, sname, age, log, pass);
        userStorage.addReg(registration);
        System.out.println("User createt");
    }

    private static void addBook() {
        System.out.println("Input book title");
        String btitle = scanner.nextLine();
        Author author = addAuthor();
        System.out.println("Input book price");
        String bPriceStr = scanner.nextLine();
        System.out.println("Input book count");
        String bCountStr = scanner.nextLine();
        System.out.println("Input book gener");
        String bGener = scanner.nextLine();

        double bPrice = Double.parseDouble(bPriceStr);
        int bCount = Integer.parseInt(bCountStr);

        Book book = new Book(btitle, author, bPrice, bCount, bGener);

        bookStorage.add(book);


    }

    private static Author addAuthor() {
        System.out.println("Input author name");
        String name = scanner.nextLine();
        System.out.println("Input author surname");
        String surname = scanner.nextLine();
        System.out.println("Input author email");
        String email = scanner.nextLine();
        System.out.println("Input autor gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, gender);

        authorStorage.add(author);
        return author;

    }


}

package homework.book.storage;

import homework.book.models.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            Book[] tmp = new Book[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];

            }
            array = tmp;
        }
        array[size++] = value;

    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }

    public void printBookByAuthorName(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(name)) {

                System.out.println(array[i]);
                count++;
            }


        }
        if (count == 0) {
            System.out.println("No Author");
        }

    }

    public void printBookByGener(String gener) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getGener().equals(gener)) {
                System.out.println(array[i]);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No Gener");
        }

    }

    public void printBookByPriceRange(double firstPrice, double secondprice) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() < secondprice && array[i].getPrice() > firstPrice) {
                System.out.println(array [i]);
            }

        }
        if (count == 0){
            System.out.println("No price range");
        }
    }
}

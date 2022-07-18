package homework.book.storage;

import homework.book.models.Author;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = 0;



    public void add(Author value) {
        if (size == array.length) {
            Author[] tmp = new Author[array.length + 10];
            for (int i = 0; i <size ; i++) {
                tmp[i] = array[i];


            }
            array = tmp;
        }
        array[size++] = value;

    }
    public void print(){
        for (int i = 0; i < size ; i++) {
            System.out.println(array[i]);

        }
    }

    public void printAuthorByIndex(int authorIndex) {
        int index = 0;
        for (int i = authorIndex; i <size ; i++) {
            if(authorIndex == i){
                System.out.println(array[i]);
                index++;
            }
        }
        if(index == 0){
            System.out.println("No index");
        }
    }

}

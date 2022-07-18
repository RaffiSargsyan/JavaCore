package homework.book.storage;

import homework.book.models.Registration;

public class UserStorage {


    private Registration[] array = new Registration[10];

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addReg(Registration value) {
        if (size == array.length) {
            Registration[] tmp = new Registration[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];


            }
            array = tmp;
        }
        array[size++] = value;


    }

    public void login(String log, String pass) {
        int count = 0;

        for (int i = 0; i < size; i++) {

            if (array[i].getLogin().equals(log) && array[i].getPassword().equals(pass)) {
                System.out.println("User createt");
                System.out.println("Welcome " + array[i].getName());
                count++;

            }
        }
        if (count == 0){
            System.out.println("Login or Password invalid");
        }

    }
}

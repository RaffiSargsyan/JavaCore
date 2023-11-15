package homework.type.example;

public class Human {
    public String name;
    Car car;
    BankAccount bank;

    void showInfo() {
        System.out.println("Name " + name + ", color his car is " + car.color
                + " and his balance is "
                + bank.balance);
    }
}

package homework.type.example;

public class Test {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Raffi";
        human1.car = new Car("red", 12.2);
        human1.bank = new BankAccount(1, 10.0);
        human1.showInfo();

    }
}

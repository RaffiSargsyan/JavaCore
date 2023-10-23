package practice;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Animal animal = new Animal();

        try {
            Dog dog = (Dog) animal;
            dog.bark();
        } catch (ClassCastException e) {
            System.out.println("exception : " + e.getMessage());
        }


        //use instance of
        if (animal instanceof Dog) {
            Dog anotherDog = (Dog) animal;
            anotherDog.bark();
        } else {
            System.out.println("animal не является экземпляром класса Dog.");
        }
    }
}
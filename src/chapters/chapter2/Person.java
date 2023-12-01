package chapters.chapter2;

public class Person {

    private String name;
    private int age;

    // constructor for Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // constructor to create a new Person with copy
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {

        Person originalPerson = new Person("Amalia", 25);
        Person copyPerson = new Person(originalPerson);

        System.out.println("Original Person: " + originalPerson.getName() + ", Age: " + originalPerson.getAge());
        System.out.println("Copied Person: " + copyPerson.getName() + ", Age: " + copyPerson.getAge());

        // I changed the original person
        originalPerson.setName("Raffi");
        originalPerson.setAge(25);


        // I show the original and the copied person
        System.out.println("Original Person (Modified): " + originalPerson.getName() + ", Age: " + originalPerson.getAge());
        System.out.println("Copied Person (Unchanged): " + copyPerson.getName() + ", Age: " + copyPerson.getAge());


        //Change the copied person
        copyPerson.setName("Arpine");
        copyPerson.setAge(25);

        System.out.println("Original Person (Modified): " + originalPerson.getName() + ", Age " + originalPerson.getAge());
        System.out.println("Copied Person (Changed): " + copyPerson.getName() + ", Age: " + copyPerson.getAge());
    }
}
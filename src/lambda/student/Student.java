package lambda.student;

public class Student {
    private String name;
    private int age;

    private boolean isArmenian;

    Student(String name, int age, boolean isArmenian) {
        this.name = name;
        this.age = age;
        this.isArmenian = isArmenian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    @Override
    public String toString() {
        return "name " + name + " " + "age " + age + " Is Armenian " + isArmenian;
    }
}

package homework.type;

public class Human {
    public String name;
    public int age;

    Human(String nameOfHuman, int year) {
        name = nameOfHuman;
        age = year;
        System.out.println("First object name is " + name + " and her age is " + age);
    }
//    Human(){
//        name = "Amalia Hakobyan";
//        age = 22;
//    }

    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public int sum1(int x1, int y1, int z1) {
        int result2 = sum(x1, y1, z1);
        return result2;
    }
}



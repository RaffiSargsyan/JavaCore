package homework.type;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human("Amalia", 23);

        System.out.println(human1.name);
        System.out.println(human1.age);


        String s = "Raffi";
        String s2 = "Amalia";

        String result = s.concat(s2);
        System.out.println(result);

        StringBuilder s4 = new StringBuilder();
        StringBuilder append = s4.append(s).append(s2);

        System.out.println(append);

        int sum = human1.sum(10, 92, 93);
        System.out.println(sum);
        System.out.println(sum * 2);

        System.out.println(human1.sum(99, 99, 1));

        int i = human1.sum1(10, 20, 21);
        System.out.println(i);
    }
}

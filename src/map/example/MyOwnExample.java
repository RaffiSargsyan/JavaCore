package map.example;

import java.util.HashMap;

public class MyOwnExample {
    public static void main(String[] args) {

        HashMap<Integer, Language> map = new HashMap<>();
        map.put(1, new Language("One", "Մեկ"));
        map.put(2, new Language("Two", "Երկու"));
        map.put(3, new Language("Three", "Երեք"));

        System.out.print(map.toString());
//        map.put(4, "Four");
//        map.put(5, "Five");
//        Scanner scanner = new Scanner(System.in);
//        int i = Integer.parseInt(scanner.nextLine());
//        int i1 = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int i1 = 2;

        System.out.println(map.get(i).hy + " + " + map.get(i1).hy + " = " + map.get(i + i1).hy);
        System.out.println(map.get(i).en + " + " + map.get(i1).en + " = " + map.get(i + i1).en);

    }
}

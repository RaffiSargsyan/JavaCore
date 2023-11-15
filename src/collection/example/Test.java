package collection.example;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Raffi", 25);
        Student s2 = new Student("Raffi", 25);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(null));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        System.out.println(hashSet.contains(s2));


        String s = "Hello";
        String s_1 = "Hello";
        System.out.println(s == s_1);
        System.out.println(s1.equals(s_1));

        s.toLowerCase();
        System.out.println(s); //Value of String we cannot change

        String s3 = s.toUpperCase();
        System.out.println(s3); //but in this String we have new variable new String
        System.out.println(s);  //then we to use String always created new Object


        String name = "Raffi";
        String surname = "Sargsyan";
        String result = "Hello " + name + " " + surname + " 2023";
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder();
        String result2 = stringBuilder
                .append("Hello ")
                .append(name)
                .append(" ")
                .append(surname)
                .append(" 2023").toString();
        System.out.println(result2);

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
    }
}

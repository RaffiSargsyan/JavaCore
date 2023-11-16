package homework.collection.arrayList.arrayListMethods;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("nice");
        arrayList.add("good");
        arrayList.add("fine");
        arrayList.add("well");
//        arrayList.add(1, "beautiful");

        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();

        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();

        //get method
        String s = arrayList.get(1);
        System.out.println(s);

        //set method, set element with index
        String s2 = arrayList.set(0, "nike");
        System.out.println(arrayList);

        //remove element with value
        arrayList.remove("nike");
        System.out.println(arrayList);

        //remove element with index
        arrayList.remove(2);
        System.out.println(arrayList);

    }

}

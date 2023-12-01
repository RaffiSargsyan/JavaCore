package collectionAndMap.list.arrayList.arrayListMethods2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("good");
        arrayList.add("well");
        arrayList.add("well");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("today");
        arrayList2.add("tomorrow");
        System.out.println(arrayList2);

        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

//        clear all list
//        arrayList.clear();
//        System.out.println(arrayList);


        //indexOf find first index whose value is 'well'
        int index = arrayList.indexOf("well");
        System.out.println(index);

        //lastIndexOF find the last index whose value is again 'well'
        int lastIndex = arrayList.lastIndexOf("well");
        System.out.println(lastIndex);

        System.out.println(arrayList.contains("well"));


    }
}

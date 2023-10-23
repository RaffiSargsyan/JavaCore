package homework.collection;


import java.util.*;

public class CollectionExample {

    public static void main(String[] args) throws NotIndex {
        String[] array1 = {"Java", "Sql", "Python"};

        // System.out.println(arrayToList(array1));
        // List<String> str = new ArrayList<String>();
        // System.out.println(removeById(str, 45));
        // List<String> arrayList  = new ArrayList<>();
        // System.out.println(listToSet(arrayList));
        // System.out.println(listToSet(arrayList).getClass());
        //  List<Integer> list = new ArrayList<>();
        //  System.out.println(listToLinkedList(list));
        //  System.out.println(listToLinkedList(list).getClass());
        // List<Integer> intindex = new LinkedList<>();
        // System.out.println(reverseNumbers(intindex));
        List<String> list = new ArrayList<>();
        list.add("7");
        list.add("7");
        list.add("7");
        list.add("7");
        list.add("7");
        list.add("7");
        list.add("7");
       // printFirstFive(list);
       // List<String> liststr = new ArrayList<>();
       // sizeOfList(liststr);

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {

        List<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);

        }
        return arrayList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) throws NotIndex {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));

        }
        if (index < list.size()) {
            list.remove(index);
        } else {
            throw new NotIndex("Not Index");

        }
        return list;
    }


    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));


        }
        //list.add("Aaa");
        //list.add("addd");
        //list.add("zz");
        HashSet<String> listSet = new HashSet<>(list);
        for (int i = 0; i < list.size(); i++) {
            listSet.add(String.valueOf(i));

        }
        return listSet;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        return linkedList;
    }


    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            Integer integer = list.remove(j);
            list.add(i, integer);

        }
        return list;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        return list.size();
    }
}


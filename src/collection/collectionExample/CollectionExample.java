package collection.collectionExample;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) throws NotIndex {
        String[] arrayOfStrings = {"Apple", "Samsung", "Huawei"};
        List<String> stringList = convertArrayToArrayList(arrayOfStrings);
        System.out.println(stringList);

        System.out.println("-------------");
        List<String> stringListTwo = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "watermelon"));
        int indexToRemove = 1;
        System.out.println("Our list before the change" + stringListTwo);
        List<String> updateList = removeElementAtIndex(stringListTwo, indexToRemove);
        System.out.println("Updated list " + updateList);

        System.out.println("------------");

        List<String> stringHashSet = new ArrayList<>(Arrays.asList("Armenia", "Africa", "Ireland"));
        HashSet<String> hashSet = convertListToHashSet(stringHashSet);
        System.out.println(hashSet);
        System.out.println(hashSet.getClass());

        System.out.println("----------");

        List<Integer> integerList = new ArrayList<>(Arrays.asList(12, 3, 4, 3));
        LinkedList<Integer> linkedList = listToLinkedList(integerList);
        System.out.println(linkedList);

        System.out.println("--------");
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reverseNumbers(list));

        System.out.println("---------");
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(shuffleList(list1));

        System.out.println("----------");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printFirstFive(list2);

        System.out.println();
        System.out.println("---------");
        List<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(sizeOfList(list3));
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    // write the method so that we call it and give it an array of strings,
    // it returns an ArrayList with the same elements
    static List<String> convertArrayToArrayList(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        return list;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    //write the method in such a way that if we call and give any list and index,
    // it deletes the element under that index and returns the same list without that element.
    static <T> List<T> removeElementAtIndex(List<T> list, int indexToRemove) {
        if (indexToRemove >= 0 && indexToRemove < list.size()) {
            list.remove(indexToRemove);
        } else {
            System.out.println("Index out of bound or list is empty !");
        }
        return list;
    }


    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static HashSet<String> convertListToHashSet(List<String> list) {
        HashSet<String> hashSet = new HashSet<>(list);
        return hashSet;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    // write the method so that it accepts any list of Integers, returns a LinkedList object with the same values.
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> integers = new LinkedList<>(list);
        return integers;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    //write the method so that it accepts any list of integers, returns a new list, in which the elements will be in reverse order.
    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>(list);
        Collections.reverse(integerList);
        return integerList;

//        List<Integer> integerList1 = new ArrayList<>();
//        for (int i = integerList.size() - 1; i >= 0; i--) {
//            integerList1.add(integerList.get(i));
//        }
//        return integerList1;
    }

    //write the method so that it accepts any list of integers, returns a new list,
    // in which the elements will be in shuffle order.
    static List<Integer> shuffleList(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>(list);
        Collections.shuffle(integerList);
        return integerList;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    //write the method in such a way that whatever the size of the list we give to this method,
    // it prints only the first 5 pieces.
    static void printFirstFive(List<Integer> list) {
        int limit = 0;
        for (Integer s : list) {
            if (limit >= 5) {
                break;
            }
            System.out.print(s + " ");
            limit++;
        }
    }


    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    //write the method so that whatever list we give returns how many elements are in that list
    static int sizeOfList(List<String> list) {
        List<String> stringList = new ArrayList<>(list);
        return stringList.size();
    }
}


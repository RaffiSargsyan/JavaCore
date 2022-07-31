package homework.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    private static final HashMap<Integer, String> hashFootbal = new HashMap<>();
    private static final List<FootballTeamMember> footballTeamMember = new ArrayList<>();

    public static void main(String[] args) {
         // System.out.println(createFootballTeam(footballTeamMember));
       // System.out.println(removeFromMap(hashFootbal, 3));
       // printAllMemberNames(hashFootbal);

        printAllMembers(hashFootbal);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        for (FootballTeamMember member : members) {
            hashFootbal.put(member.getNumber(), member.getName());
        }
        return hashFootbal;

    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        hashFootbal.put(2, "Messi");
        hashFootbal.put(1, "Xavi");
        hashFootbal.put(3, "Ineista");
        for (Integer integer : memberMap.keySet()) {
            if (integer.equals(removedNumber)){
                hashFootbal.remove(removedNumber);
                return true;
            }

        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        hashFootbal.put(10, "Maradona");
        hashFootbal.put(13, "Muller");
        hashFootbal.put(12, "Ronaldino");
        for (String value : memberMap.values()) {
            System.out.println(value);
        }


    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        hashFootbal.put(10, "Messi");
        hashFootbal.put(8, "Xavi");
        for (Map.Entry<Integer, String> integerStringEntry : memberMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue() );

        }

    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
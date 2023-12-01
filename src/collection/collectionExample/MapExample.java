package collection.collectionExample;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        List<FootballTeamMember> teamMembers = new ArrayList<>();

        teamMembers.add(new FootballTeamMember(10, "Messi"));
        teamMembers.add(new FootballTeamMember(7, "Ronaldo"));
        teamMembers.add(new FootballTeamMember(13, "Ballack"));
        teamMembers.add(new FootballTeamMember(8, "Xavi"));
        Map<Integer, String> footballTeam = createFootballTeam(teamMembers);

        for (Map.Entry<Integer, String> entry : footballTeam.entrySet()) {
            System.out.println("Player Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("----------");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Messi");
        hashMap.put(7, "Ronaldo");
        System.out.println(removeFromMap(hashMap, 7));
        System.out.println(hashMap);

        System.out.println("----------");

        printAllMemberNames(footballTeam);

        System.out.println("--------");
        printAllMembers(footballTeam);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    //We have a FootballTeamMember list, we need to get a HashMap where the key will be the player's number and the value will be his name.
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (FootballTeamMember member : members) {
            hashMap.put(member.getNumber(), member.getName());
        }
        return hashMap;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    //In the method, we must delete removedNumber from the given map if it exists and return true, if not return false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        if (memberMap.containsKey(removedNumber)) {
            memberMap.remove(removedNumber);
            return true;
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    //We will only print the names with the method
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (String x : memberMap.values()) {
            System.out.print(x + " ");
        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը
    //With the method we will print either the number or the name of the player
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> integerStringEntry : memberMap.entrySet()) {
            System.out.println("Number - " + integerStringEntry.getKey() + " "
                    + "Name - " + integerStringEntry.getValue());
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
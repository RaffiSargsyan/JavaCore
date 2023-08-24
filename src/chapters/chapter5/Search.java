package chapters.chapter5;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 8;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value is found !");
    }
}

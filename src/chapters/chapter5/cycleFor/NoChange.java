package chapters.chapter5.cycleFor;

public class NoChange {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // we cannot change array with this
        }
        System.out.println();
        for (int x : nums)
            System.out.print(x + " ");
    }
}



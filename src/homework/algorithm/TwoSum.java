package homework.algorithm;
public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // If no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}


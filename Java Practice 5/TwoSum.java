import java.util.*;

public class TwoSum {
    public static int[] sumOfTwo(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = { i, j };
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 50;

        int[] indices = sumOfTwo(nums, target);

        if (indices != null) {
            System.out.println("Target sum indices are: " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

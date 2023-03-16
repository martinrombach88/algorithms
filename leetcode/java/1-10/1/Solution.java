import java.util.Arrays;

/* Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public static void main(String[] args) {
        int[] case1 = { 2, 7, 11, 15 };
        int[] case2 = { 3, 2, 4 };
        int[] case3 = { 3, 3 };
        int[] case4 = { 3, 2, 3 };

        case1 = twoSum(case1, 9); // [0, 1]
        case2 = twoSum(case2, 6); // [1, 2]
        case3 = twoSum(case3, 6); // [0, 1]
        case4 = twoSum(case4, 6); // [0, 2]
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // Every num in array must be compared to every other
        // nested loop needed

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j < i && nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                } else if (i < j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
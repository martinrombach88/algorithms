class Solution {

    public static void main(String[] varargs...){
        twoSum([2,7,11,15], 9) //[0, 1]
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
                result[0] = nums[i];
                result[1] = nums[i + 1];
            }
        }
    }
}
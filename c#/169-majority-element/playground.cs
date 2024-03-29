public class Solution {
    public int MajorityElement(int[] nums) {
        //boyer algorithm -> count++ and count--
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.Length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}   
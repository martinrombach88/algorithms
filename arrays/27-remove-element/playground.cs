public class Solution {
    //arrays in c# are immutable, so you need to 
    //move all the elements irrelevant to the end.
    
    //two pointers + swap
    //array is in the right order

    public int RemoveElement(int[] nums, int val) {
        int i = 0;
        int j = nums.Length-1;

        while (i <= j) {
            if (nums[i] != val) {
                i++;
                continue;
            }
            if (nums[i] == val && nums[j] == val) {
                j--;
                continue;
            }
            if (nums[i] == val && nums[j] != val) {
                //swap
                SwapElements(nums, i, j);
                continue;
            }
        }
        Console.WriteLine("[{0}]", string.Join(", ", nums));
        return i;
    }

    
    public int[] SwapElements(int[] nums, int idx1,  int idx2) {
        //use an index of method
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        return nums;
    }
}
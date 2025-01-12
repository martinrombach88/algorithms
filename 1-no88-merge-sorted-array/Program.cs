//Part of Leetcode Interview 150. Follow link to test solution.
//https://leetcode.com/problems/merge-sorted-array/solutions/6269350/martins-solution-by-martinrombach88-kfk3

public class Solution
{
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        //nums1
        //m -> no of elements in nums1
        //nums2
        //n -> no of elements in nums2
        //combine + sort in increasing / ascending order

        //concat
        //nums1 = nums1.Concat(nums2).ToArray();
        //its not javascript. the array has a set length.
        int n2 = 0;

        for (int i = 0; i < nums1.Length; i++)
        {
            //i should be equal m, because of 0 based.
            //0=1, 1=2, 2=3, 3=0 (start of nums2 injection)
            if (i >= m && n > 0)
            {
                nums1[i] = nums2[n2];
                n2++;
            }
        }
        //sort at the end.
        Array.Sort(nums1);
    }
}

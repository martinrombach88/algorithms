public class Solution {
    public int MaxProfit(int[] prices) {
        int l = 0; //left
        int r = 1; //right
        int p = 0; //profit

        //you don't need a for loop, the extra index is redundant 
        //(why use i when you can r)
        while (r < prices.Length) {
            //only check if buy day (l) is less than sell day (r)
            if (prices[l] < prices[r]) {
                //temp profit value to compare with final profit value
                int cp = prices[r] - prices[l]; //current profit

                //If temp profit is bigger, profit is updated
                p = Math.Max(p, cp);

                //could also be nested p = cp > p ? cp : p;
            }
            else {
                //if r is lower l, we need to use it in the next iteration
                //so we move straight to the index
                l=r;
            }
            r++;
        }
        return p;
    }
}
public static class Kata
{
    public static int BlowCandles(string str)
    {


        //1 Build the list of ints
        List<int> nums = new List<int>();

        for (int i = 0; i < str.Length; i++)
        {
            int t = (int)Char.GetNumericValue(str[i]);
            //Console.WriteLine(t + " is type " + t.GetType());
            nums.Add(t);
        }
        int c = 0;

        for (int i = 0; i < nums.Count;)
        {
            while (nums[i] > 0)
            {

                if (i < nums.Count - 2)
                {
                    nums[i]--;
                    nums[i + 1]--;
                    nums[i + 2]--;
                    c++;
                    continue;
                }
                if (i < nums.Count - 1)
                {
                    nums[i]--;
                    nums[i + 1]--;
                    c++;
                    continue;
                }

                if (i == nums.Count - 1)
                {
                    nums[i]--;
                    c++;
                    continue;
                }
            }
            i++;
        }
        /*
        2 decrement the ints and keep count
        sliding window technique is recommended
        (keep a running total, total changes to -first, +last)
        if canSlide, i++
        else blow i, i+1, i+2 and c++
        */

        Console.WriteLine(c);


        return c; // Let's see how we gonna blow these candles...
    }
}
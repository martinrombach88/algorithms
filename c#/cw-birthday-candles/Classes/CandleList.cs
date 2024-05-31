namespace BirthdayCandles.Classes
{
    public class CandleList
    {

        public List<int> candles { get; set; } = new List<int>();

        //class purpose -> to take a string and convert it into a list of ints 

        public CandleList(string list)
        {
            for (int i = 0; i < list.Length; i++)
            {
                int t = (int)Char.GetNumericValue(list[i]);
                candles.Add(t);
            }
            // }
            // public void ConvertStringListToIntList()
            // {
        }

        // }

        public void PrintCandleList()
        {

            foreach (int candle in candles)
            {
                Console.Write(" " + candle);
            }
            Console.WriteLine("");

        }
        public void Test()
        {
            Console.WriteLine("print from CandleList");
        }
    }
}



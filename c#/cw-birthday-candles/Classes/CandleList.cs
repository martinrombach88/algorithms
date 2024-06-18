namespace BirthdayCandles.Classes
{
    public class CandleList
    {

        public List<Candle> candles { get; set; } = new List<Candle>();

        //class purpose -> to take a string and convert it into a list of ints 

        public CandleList(string list)
        {
            for (int i = 0; i < list.Length; i++)
            {
                int blowCount = (int)Char.GetNumericValue(list[i]);
                Candle candle = new Candle(blowCount);
                candles.Add(candle);
            }
        }

        public void PrintCandleList()
        {
            Console.Write("Blow counts for all candles");
            foreach (Candle candle in candles)
            {
                Console.Write(" " + candle._blowCount);
            }
            Console.WriteLine("");

        }
    }
}



namespace BirthdayCandles.Classes
{

    public class ThreeCandleBlowCounter
    {
        public int GetCandleBlowCount(CandleList candleList)
        {
            int c = 0;
            List<int> candles = candleList.candles;

            for (int i = 0; i < candles.Count;)
            {
                while (candles[i] > 0)
                {

                    if (i < candles.Count - 2)
                    {
                        candles[i]--;
                        candles[i + 1]--;
                        candles[i + 2]--;
                        c++;
                        continue;
                    }
                    if (i < candles.Count - 1)
                    {
                        candles[i]--;
                        candles[i + 1]--;
                        c++;
                        continue;
                    }

                    if (i == candles.Count - 1)
                    {
                        candles[i]--;
                        c++;
                        continue;
                    }
                }
                i++;
            }

            return c;

        }

        public void Test()
        {
            Console.WriteLine("print from candle blow counter");
        }


    }
}

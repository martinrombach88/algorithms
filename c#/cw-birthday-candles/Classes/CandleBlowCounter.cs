namespace BirthdayCandles.Classes
{
    public class CandleBlowCounter
    {
        public int candlesBlown = 0;

        public int GetCandleBlowCountIfThreePerBlow(CandleList candleList)
        {
            int c = 0;

            for (int i = 0; i < candleList.Count;)
            {
                while (candleList[i] > 0)
                {

                    if (i < candleList.Count - 2)
                    {
                        candleList[i]--;
                        candleList[i + 1]--;
                        candleList[i + 2]--;
                        c++;
                        continue;
                    }
                    if (i < candleList.Count - 1)
                    {
                        candleList[i]--;
                        candleList[i + 1]--;
                        c++;
                        continue;
                    }

                    if (i == candleList.Count - 1)
                    {
                        candleList[i]--;
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

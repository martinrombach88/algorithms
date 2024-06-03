namespace BirthdayCandles.Classes
{
    //blowerCounter 
    //its a concrete class (i.e. a class with a constructor)
    //an abstract class is a class that must be inherited 
    //difference between an interface -> abstract has populated methods, whereas interface methods are empty 
    //static applies to variables and methods of a class only. It is not related to classes themselves. 

    public class ThreeCandleBlowCounter
    {
        /*
        public int GetCandleBlowCount(CandleList candleList) //blowCount
        {
            int c = 0;
            List<int> candles = candleList.candles;

            //
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
*/
        public void Test()
        {
            Console.WriteLine("print from candle blow counter");
        }


    }
}

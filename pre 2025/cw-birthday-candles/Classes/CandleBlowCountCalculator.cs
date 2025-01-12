/*
    //run the loop using the calculator and return the result
    //don't overcomplicate i
*/

//CandleBlowManager

namespace BirthdayCandles.Classes
{
    public class CandleBlowCountCalculator
    {

        //you're iterating over an object. do you need a foreach?
        public int GetBlowCount(CandleList list)
        {
            //list.PrintCandleList();
            //you need to use a foreach
            int c = 0;

            /*
            foreach (Candle candle in list.candles)
            {
                //candle is an object. you need to convert the references over
                //if it can't be done with a for each you may need to change your logic

                while (candle._blowCount > 0)
                {
                    {

                        if (i < candles.Length - 2)
                        {
                            candles[i].blowCount--;
                            candles[i + 1].blowCount--;
                            candles[i + 2].blowCount--;
                            c++;
                            continue;
                        }
                        if (i < candles.Length - 1)
                        {
                            candles[i].blowCount--;
                            candles[i + 1].blowCount--;
                            c++;
                            continue;
                        }

                        if (i == candles.Length - 1)
                        {
                            candles[i].blowCount--;
                            c++;
                            continue;
                        }
                    }
                    i++;
                }
            }
            /*
            int c = 0;
            for (int i = 0; i < candles.Length;)
            {
                
                while (candles[i].blowCount > 0)
                {

                    if (i < candles.Length- 2)
                    {
                        candles[i].blowCount --;
                        candles[i + 1].blowCount--;
                        candles[i + 2].blowCount--;
                        c++;
                        continue;
                    }
                    if (i < candles.Length - 1)
                    {
                        candles[i].blowCount--;
                        candles[i + 1].blowCount--;
                        c++;
                        continue;
                    }

                    if (i == candles.Length- 1)
                    {
                        candles[i].blowCount--;
                        c++;
                        continue;
                    }
                }
                i++;
            }
            Console.WriteLine(c);

            */
            return c;

        }

        //getBlowCount


    }
}

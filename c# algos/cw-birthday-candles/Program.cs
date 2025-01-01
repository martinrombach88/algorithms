using System;
using System.Collections.Generic;
using System.Linq;
using BirthdayCandles.Classes;

/*
New Classes 
-> you need individual data objects to make a list of, like Candle

Candle - an individual candle with a property of an int

CandleList - a list of Candle instances

CandleBlowCalculator - A calculator that returns the desired result when given a candle list
(a true oop solution would divide this down to individual objects but it serves no purpose)

*/

namespace BirthdayCandles
{

    internal class Program
    {
        static void Main(string[] args)
        {
            string unitTest1 = "1321";

            CandleList list = new CandleList(unitTest1);
            //list.PrintCandleList();

            //CandleBlowCountCalculator calc = new CandleBlowCountCalculator();
            //int result = calc.GetCount(list);

            foreach (Candle candle in list.candles)
            {
                /*
                Console.WriteLine("before set " + candle._blowCount);
                int t = candle._blowCount - 1;
                candle._blowCount = t;
                Console.WriteLine("after set " + candle._blowCount);
                
                next:
                use the code above to apply the logic
                
                */
            }



        }
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
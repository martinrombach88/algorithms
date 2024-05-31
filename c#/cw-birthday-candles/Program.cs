using System;
using System.Collections.Generic;
using System.Linq;
using BirthdayCandles.Classes;


namespace BirthdayCandles
{

    internal class Program
    {
        static void Main(string[] args)
        {
            string unitTest1 = "1321";
            string test = "print in main class";
            Console.WriteLine(test);

            CandleList list = new CandleList();
            list.Test();
            list.ConvertStringListToIntList(unitTest1);
            list.PrintCandleList();

            ThreeCandleBlowCounter counter = new ThreeCandleBlowCounter();
            counter.Test();
            int result = counter.GetCandleBlowCount(list);
            Console.WriteLine(result);
        }
    }

}

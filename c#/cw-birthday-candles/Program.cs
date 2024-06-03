using System;
using System.Collections.Generic;
using System.Linq;
using BirthdayCandles.Classes;

/*
New Classes 
Candle - an individual candle with a property of an int

CandleList - a list of Candle instances

Blower - an instance of a process which blows out a sequence of candles. 
provides a method which returns the number of blows required to blow out a sub list.
Has to return the remaining sublist (i.e. 1 2 1 -> 0 1 0)

BlowCounter - receives a candle list and feeds a set of sequences to an instance/instances of a blower/blowers 
(if you can do it with 1 blower that’s best). it sums all counts from each blow and returns the sum.

*/

namespace BirthdayCandles
{

    internal class Program
    {
        static void Main(string[] args)
        {
            string unitTest1 = "1321";
            string test = "print in main class";
            Console.WriteLine(test);

            CandleList list = new CandleList(unitTest1);
            list.PrintCandleList();

            //ThreeCandleBlowCounter counter = new ThreeCandleBlowCounter();
            //counter.Test();
            //int result = counter.GetCandleBlowCount(list);
            //Console.WriteLine(result);
        }
    }

}

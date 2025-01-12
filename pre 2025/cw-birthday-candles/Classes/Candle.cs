namespace BirthdayCandles.Classes
{
    public class Candle
    {
        public int _blowCount { get; set; } = 0;

        public Candle(int blowCount)
        {
            _blowCount = blowCount;
        }
    }
}
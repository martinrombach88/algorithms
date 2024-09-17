using System.Net.WebSockets;

int total = 0;
IEnumerable<string> boxes = File.ReadLines("input.txt");
foreach(string box in boxes) {
   List<int> intBox = wrappingPaper.SplitString(box);
   total += wrappingPaper.CalculateBoxAndSlack(intBox);
}
Console.WriteLine(total);
//too high.
public static class wrappingPaper {

    public static List<int> SplitString(string dimString) {
        //sample string 20x3x11
        string[] nList = dimString.Split("x");
    
        //with int[], you cannot add or remove elements dynamically. Use List<int> for Add, Remove
        List<int> dimensions = new List<int>{};

        foreach (string n in nList) {
           dimensions.Add(int.Parse(n));   
       }
       return dimensions;
    }

    public static int CalculateBoxAndSlack(List<int> box) {
        //2*l*w + 2*w*h + 2*h*l. + smallest side
        //result is too high.
        //your ternary has 0s, so it should be too low

        int total = 0;
        int s1 =  2 * box[0] * box[1];
        int s2 = 2 * box[1] * box[2];
        int s3 = 2 * box[0] * box[2];

        //smallest side is correct except when its zero
        int ss = s1 < s2 && s1 < s3 ? s1 : s2 < s1 && s2 < s3 ? s2 : s3 < s1 && s3 < s2 ? s3 : 0;
        //need better logic for this

        //Console.WriteLine("s1 " + s1 + " s2 " + s2 +" s3 " + s3 + " so ss = " + ss);
        total += s1;
        total += s2;
        total += s3;
        total += ss;

        return total;
    }
}
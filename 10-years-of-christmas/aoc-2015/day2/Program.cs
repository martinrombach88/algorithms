using System.Net.WebSockets;

int total = 0;
IEnumerable<string> boxes = File.ReadLines("input.txt");
foreach(string box in boxes) {
   List<int> intBox = wrappingPaper.SplitString(box);
   total += wrappingPaper.CalculateBox(intBox);
   total += wrappingPaper.CalculateSlack(intBox);
}
Console.WriteLine(total);

public static class wrappingPaper {

    public static List<int> SplitString(string dimString) {
        //sample string 20x3x11
        string[] nList = dimString.Split("x");
    
        //with int[], you cannot add or remove elements dynamically. Use List<int> for Add, Remove
        List<int> dimensions = new List<int>{};

        foreach (string n in nList) {
           dimensions.Add(int.Parse(n));   
       }
        List<int> sides = new List<int>{};
        sides.Add(dimensions[0] * dimensions[1]);
        sides.Add(dimensions[1] * dimensions[2]);
        sides.Add(dimensions[2] * dimensions[0]);

       return sides;
    }

    public static int CalculateBox(List<int> box) {
        int total = 0;
        total += (box[0] * 2);
        total += (box[1] * 2);
        total += (box[2] * 2);

        return total;
    }
    //it was too high because you added the slack calculation into the box calculation. 
    //Methods should do 1 thing as much as possible.
    public static int CalculateSlack(List<int> box) {
        int smallest = box[0];
        if (box[1] < smallest) {
            smallest = box[1];
        }
        if (box[2] < smallest) {
            smallest = box[2];
        }
        
        return smallest;
    }
}
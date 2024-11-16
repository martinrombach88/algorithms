using System.Net.WebSockets;

int totalPaper = 0;
int totalRibbon = 0;
IEnumerable<string> boxes = File.ReadLines("input.txt");
foreach(string box in boxes) {
   List<int> dimensions = Wrapping.CalculateDimensions(box);
   List<int> sides = Wrapping.CalculateSides(dimensions);
   totalPaper += Wrapping.CalculateBox(sides);
   totalPaper += Wrapping.CalculateSlack(sides);
   totalRibbon += Wrapping.CalculateRibbon(dimensions);
   totalRibbon += Wrapping.CalculateBow(dimensions);
}
Console.WriteLine("paper: " + totalPaper);
Console.WriteLine("ribbon: " + totalRibbon);


public static class Wrapping {

    public static List<int> CalculateDimensions(string dimString) {
        //sample string 20x3x11
        string[] nList = dimString.Split("x");
    
        //with int[], you cannot add or remove elements dynamically. Use List<int> for Add, Remove
        List<int> dimensions = new List<int>{};

        foreach (string n in nList) {
           dimensions.Add(int.Parse(n));   
       }
       return dimensions;
    }
    public static List<int> CalculateSides(List<int> dimensions) {
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
    //its still too high when you use the dimensions (3858306)
    //you can only really change the inputs here.
    //clue -> the order of the inputs is wrong. read the prompt!
    //solution -> the prompt says the ribbons are based on the shortest sides. This means the smallest dimensions must be used first,
    //as usually the array is in random order, with any possible dimension.
    public static int CalculateRibbon(List<int> box) {
        box.Sort();
        return box[0] + box[0] + box[1] + box[1];
    }

    public static int CalculateBow(List<int> box) {
        box.Sort();
        return box[0] * box[1] * box[2];
    }
}
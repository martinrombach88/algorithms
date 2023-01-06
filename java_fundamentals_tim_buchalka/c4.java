public class c4 {
//MegaBytes Converter
// Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
// The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

// Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

// XX represents the original value kiloBytes.
// YY represents the calculated megabytes.
// ZZ represents the calculated remaining kilobytes.
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(2500);
        //Expected result: Print string "2500 KB = 2 MB and 452 KB"
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb = 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + ((kiloBytes - (kiloBytes % mb)) / 1024) + " MB and " + kiloBytes % mb + " KB");
        }
     }
}

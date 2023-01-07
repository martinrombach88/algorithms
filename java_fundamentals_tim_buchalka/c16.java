public class c16 {
    //NATO Alphabet Generator A-E
    //Take a capital letter as an input

    public static void main(String[] args) {
        TradNato("A");
        TradNato("B");
        TradNato("C");
        TradNato("D");
        TradNato("E");
        TradNato("5");
    }

    public static void TradNato(String charValue) {
        switch(charValue) {
            case "A":
                System.out.println("Able");
                break;
            case "B":
                System.out.println("Baker");
                break;
            case "C":
                System.out.println("Charlie");
                break;
            case "D":
                System.out.println("Dog");
                break;
            case "E":
                System.out.println("Easy");
                break;
            default:
                System.out.println(charValue + " is not a valid letter.");
                break;
        }   
    }

}
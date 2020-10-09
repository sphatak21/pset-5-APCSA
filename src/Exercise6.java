import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String suit;
        String num;
        boolean suitBool = false;
        boolean numBool = false;
        System.out.print("Enter a playing card: ");
        String input = in.nextLine();
        String Values[] = new String[] {
                "Ace", "2", "3", "4","5", "6", "7", "8", "9", "T", "Jack","Queen","King"
        };
        String suits[] = new String[] {
                "Spades", "Hearts", "Diamonds", "Clubs"};
        int length = input.length();
        num = input.substring(0, length-1).toUpperCase();
        suit = Character.toString(input.charAt(input.length()-1)).toUpperCase();
        for(int i = 0; i < suits.length; i++){
            String current_suit = suits[i];
            String firstSuit = Character.toString(current_suit.charAt(0));
            if(firstSuit.equals(suit)){
                suit = current_suit;
                suitBool = true;
            }
        }
        for (int j = 0; j < Values.length; j++) {
            String current_val = Values[j];
            String firstVal = Character.toString(current_val.charAt(0));
            if (firstVal.equals(num)) {
                num = current_val;
                numBool = true;
            }
        }
        if(num.equals("T")){
            num = "10";
        }
        if(numBool == false){
            System.out.printf("\nThat's not a valid rank.\n");
        }
        if(suitBool == false){
            System.out.printf("\nThat's not a valid suit.\n");
        }
        if (numBool == true && suitBool==true){
            System.out.printf("\n" + num + " of " + suit + "\n");
        }
        in.close();
    }
}


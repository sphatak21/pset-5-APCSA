import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String matter = "";
        boolean formatBool = false;
        String input = in.nextLine();
        int length = input.length();
        String temp = input.substring(0, length-2);
        String tempType = Character.toString(input.charAt(length-1)).toUpperCase();
        double tempNum = Double.valueOf(temp);
        double tempNumCels = 0;
        if(tempType.equals("F")){
            tempNumCels = (tempNum - 32.0) * 5 / 9;
            formatBool = true;
        }else if (tempType.equals("C")){
            tempNumCels = tempNum;
            formatBool = true;
        }else {
            formatBool = false;
        }
        tempNum = tempNumCels;
        if(tempNum >= 100){
            matter = "Gas.";
        }else if(tempNum <= 0){
            matter = "Solid.";
        }else{
            matter = "Liquid.";
        }
        if(formatBool == false){
            System.out.println("\nThat's not a valid scale.");
        }else {
            System.out.println("\n" + matter);
        }
        in.close();
    }
}

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an 3 integers.");
        System.out.printf("\n\nEnter integer: ");
        int input1 = in.nextInt();

        System.out.printf("Enter integer: ");
        int input2 = in.nextInt();

        System.out.printf("Enter integer: ");
        int input3 = in.nextInt();

        if(input3 == input2 && input2 == input1){
            System.out.printf("\nSame.");
        } else if (input3<=input2 && input2<=input1){
            if (input3 == input2 || input2 == input1) {
                System.out.println("\nDecreasing.");
            }else{
                System.out.println("\nStrictly decreasing.");
            }
        } else if (input3>=input2 && input2>=input1){
            if (input3 == input2 || input2 == input1) {
                System.out.println("\nIncreasing.");
            }else{
                System.out.println("\nStrictly increasing.");
            }
        } else{
            System.out.println("\nUnordered.");
        }
        in.close();
    }
}

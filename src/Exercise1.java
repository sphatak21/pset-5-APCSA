import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = in.nextInt();
        if(input > 0){
            System.out.println("\nPositive.");
        }else if (input < 0){
            System.out.println("\nNegative.");
        }else {
            System.out.println("\nZero.");
        }
        in.close();
    }
}

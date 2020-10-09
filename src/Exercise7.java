import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int input = in.nextInt();
        if(input % 4 == 0){
            System.out.println("\n" + input + " is a leap year");
        }else {
            System.out.println("\n" + input + " is not a leap year.");
        }
        in.close();
    }
}

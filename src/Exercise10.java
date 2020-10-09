import java.util.Scanner;
public class Exercise10 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = in.nextDouble();
        System.out.print("Enter hors worked: ");
        double hours = in.nextDouble();
        double salary = wage * hours;
        System.out.printf("\nYou'll make $%,.2f\n", salary, "\n");
    }
}

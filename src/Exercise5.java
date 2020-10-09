import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        double grade = in.nextDouble();
        grade = (int) (grade + 0.5);
        if(grade > 100 && grade < 0){
            System.out.printf("\n" + "Grade is invalid.");
        }else if(grade<=59){
            System.out.printf("\n" + "You received a F.");
        }else if(grade>=60 && grade<70){
            System.out.printf("\n" + "You received a D.");
        }else if(grade >=70 && grade < 80){
            System.out.printf("\n" + "You received a C.");
        }else if(grade >= 80 && grade <90){
            System.out.printf("\n" + "You received a B.");
        }else if(grade >= 90 && grade <=100){
            System.out.printf("\n" + "You received an A.");
        }
        in.close();
    }
}

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        double GPA = 0;
        double change = 0;
        boolean gradeBool = false;
        boolean signBool = false;
        String minus = "-";
        String plus = "+";
        String grade = in.nextLine();
        grade = grade.trim();
        String letter = Character.toString(grade.charAt(0)).toUpperCase();
        String[] gpa = new String[]{
            "F", "D", "C", "B", "A"
        };

        for (int i = 0; i<5; i++){
            String s = gpa[i];
            if (letter.equals(s)) {
                GPA += i;
                gradeBool = true;
            }
        }
        if(grade.length()>1) {
            String sign = Character.toString(grade.charAt(grade.length()-1));
            if(sign.equals(minus) && GPA != 0){
                change = -0.33;
                signBool = true;
            }
            if(sign.equals(plus) && GPA !=4 && GPA != 0){
                change = 0.33;
                signBool = true;
            }
        }else{
            signBool = true;
        }
        GPA += change;
        if(gradeBool==false || signBool==false){
            System.out.println("\nThat's not a valid letter grade.");
        }else{
            System.out.println("\nYour GPA is "+GPA+".");
        }
        in.close();
    }
}


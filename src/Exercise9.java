import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month: ");
        boolean month_found = false;
        String input = in.nextLine();
        input = input.toUpperCase();
        String days = "";
        String[] january = new String [] {"JANUARY", "31"};
        String[] february = new String [] {"FEBRUARY", "28", "29"};
        String[] march = new String [] {"MARCH", "31"};
        String[] april = new String [] {"APRIL", "30"};
        String[] may = new String [] {"MAY ", "31"};
        String[] june = new String [] {"JUNE", "30"};
        String[] july = new String [] {"JULY", "31"};
        String[] august = new String [] {"AUGUST", "31"};
        String[] september = new String [] {"SEPTEMBER", "31"};
        String[] october = new String [] {"OCTOBER", "31"};
        String[] november = new String [] {"NOVEMBER", "30"};
        String[] december = new String [] {"DECEMBER", "31"};
        String [][] months = {january, february, march, april, may, june, july, august, september, october, november, december};
        for (int i = 0; i<months.length; i++){
                String [] current_month = months[i];
                String current_month_name = current_month[0];
                if(input.equals(current_month_name) ||
                        input.equals(current_month_name.substring(0, 3)) ||
                        input.equals(current_month_name.substring(0,4))){

                    month_found = true;
                    if(current_month.length == 5){
                        days = current_month[current_month.length-2] + current_month[current_month.length-1];
                    }else {
                        days = current_month[current_month.length - 1];
                    }
                    break;
                }else{
                    month_found = false;
                }
        }
        if(month_found == false){
            System.out.println("\nThat's not a valid month.");
        }else{
            if(days.length() == 4){
                String dayopt1 = days.substring(0,2);
                String dayopt2 = days.substring(2,4);
                System.out.println("\n"+dayopt1 + " or " + dayopt2 + " days.");
            }else {
                System.out.println("\n"+days+" days.");
            }
        }
        in.close();
    }
}

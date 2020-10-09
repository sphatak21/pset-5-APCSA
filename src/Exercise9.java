import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month: ");
        boolean month_found = false;
        String input = in.nextLine();
        String days = "";
        String[] january = new String [] {"JANUARY", "JAN", "JANU", "31"};
        String[] february = new String [] {"FEBRUARY", "FEB", "FEBR", "28", "29"};
        String[] march = new String [] {"MARCH", "MAR", "MARC", "31"};
        String[] april = new String [] {"APRIL", "APR", "APRI", "30"};
        String[] may = new String [] {"MAY", "MAY", "MAY", "31"};
        String[] june = new String [] {"JUNE", "JUN", "JUNE", "30"};
        String[] july = new String [] {"JULY", "JUL", "JULY", "31"};
        String[] august = new String [] {"AUGUST", "AUG", "AUGU", "31"};
        String[] september = new String [] {"SEPTEMBER", "SEP", "SEPT", "31"};
        String[] october = new String [] {"OCTOBER", "OCT", "OCTO", "31"};
        String[] november = new String [] {"NOVEMBER", "NOV", "NOVE", "30"};
        String[] december = new String [] {"DECEMBER", "DEC", "DECE", "31"};
        String [][] months = {january, february, march, april, may, june, july, august, september, october, november, december};

        for (int i = 0; i<months.length; i++){
            for(int j = 0; j < months[i].length; j++){
                String [] current_month = months[i];
                if(input.toUpperCase().equals(current_month[j])){
                    month_found = true;
                    if(current_month.length == 5){
                        days = current_month[current_month.length-2] + current_month[current_month.length-1];
                    }else {
                        days = current_month[current_month.length - 1];
                    }
                }else{
                    month_found = false;
                }
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

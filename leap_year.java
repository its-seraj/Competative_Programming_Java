import java.util.Scanner;

class leap_year{
    leap_year(int year){
        if(year % 4 == 0){
            System.out.println("Year " + year + " is the Leap.");
        }
        else{
            System.out.println("Year " + year + " is Not the Leap.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for checking Leap year >>>\nEnter year : ");
        int year = sc.nextInt();

        leap_year obj = new leap_year(year);
    }
}
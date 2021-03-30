import java.util.Scanner;

class quotient_rem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find Quotient & Remainder >>>\nDivident : ");
        int no = sc.nextInt();
        System.out.println("Divider : ");
        int d = sc.nextInt();

        int rem = no % d;

        int quo = (no - rem)/d;

        System.out.println("Quotient : " + quo + " \t Remainder : " + rem);
    }
}
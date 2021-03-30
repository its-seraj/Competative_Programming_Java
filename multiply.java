import java.util.Scanner;

class multiply{
    double multiply(double no1, double no2){
        return (no1 * no2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Multiplication Program >>>\nEnter 1st Number : ");
        double no1 = sc.nextDouble();
        System.out.println("Enter 2nd Number : ");
        double no2 = sc.nextDouble();

        multiply result = new multiply();

        System.out.println("Result = " + result.multiply(no1, no2));
    }
}
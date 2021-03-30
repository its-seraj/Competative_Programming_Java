import java.util.Scanner;
import java.lang.Math;

class compound_interest{
    //method to calculate Compound Interest
    double ci(double p, double r, double y, int c){
        return (p*(Math.pow((1 + r/c), (c * y))) - p);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Calculate Compound Interest >>>\nPrincipal : ");
        double p = sc.nextDouble();
        System.out.println("Rate : ");
        double r = sc.nextDouble();
        System.out.println("Time (in Year) : ");
        double y = sc.nextDouble();
        System.out.println("Number of Copound : ");
        int c = sc.nextInt();

        compound_interest obj = new compound_interest();
        System.out.println("Compound Interest = " + obj.ci(p, r, y, c));
    }
}
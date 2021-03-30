import java.util.Scanner;

class simple_interest{

    //Method to Calculate S.I.
    double si(double p, float r, float t){
        return ((p * r * t)/100);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Calculate Simple Interest >>>\nPrincipal : ");
        double p = sc.nextDouble();
        System.out.println("Rate : ");
        float r = sc.nextFloat();
        System.out.println("Time (in Year) : ");
        float t = sc.nextFloat();

        //Calling simple interest method
        simple_interest obj = new simple_interest();
        System.out.println("S.I. = " + obj.si(p, r, t));
    }
}
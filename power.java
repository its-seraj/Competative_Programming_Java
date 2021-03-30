import java.util.Scanner;
import java.lang.Math;

class power{

    //method to calculate power
    int power(int no, int power){
        int result = no;
        for(int i = 1; i < power; i++){
            result = result * no;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to calculate Power of a Number >>> \nEnter any Number : ");
        int no = sc.nextInt();
        System.out.println("Enter Power : ");
        int power = sc.nextInt();

        //Calling Power method 
        power obj = new power();
        int result = obj.power(no, power);

        System.out.println("Result = " + result + "\t\tResult = " + Math.pow(no, power));
    }
}
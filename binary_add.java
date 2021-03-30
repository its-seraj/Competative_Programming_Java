import java.util.Scanner;
import java.lang.Math;

public class binary_add{

    //Function to convert Integer to Binary
    int result2 = 0;
    int base;
    public void Binary(int a){
        if(a > 0){
            base = (int)(Math.log10(a)/Math.log10(2));
            result2 += (int)Math.pow(10, base);
            Binary(a - (int)Math.pow(2, base));
        }
        else{
            //return;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.println("Binary Addition Program >>>\nEnter 1st Number : ");
        int a1 = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int a2 = sc.nextInt();

        //Finding lenght of Binary
        int n1 = (int)Math.log10(a1) + 1;
        int n2 = (int)Math.log10(a2) + 1;

        //Loop to get Binary to Integer
        int no1 = 0;
        for(int i = 0; i < n1; i++){
            int last = a1%10;   //getting last number
            a1 = a1/10;

            if(last != 0){
                no1 = no1 + (int)Math.pow(2, i);
            }
            else{
                //No action
            }
        }
        int no2 = 0;
        for(int i = 0; i < n2; i++){
            int last = a2%10;
            a2 = a2/10;

            if(last != 0){
                no2 = no2 + (int)Math.pow(2, i);
            }
            else{
                //No action
            }
        }

        //Print Addition of Binary
        int result1 = no1 + no2;
        System.out.println("Addition : " + result1);

        //Final value in Binary
        //Calling the Binary function
        binary_add ob = new binary_add();
        ob.Binary(result1);
        //Displaying final result in Binary
        System.out.println("Binary : " + ob.result2);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                           
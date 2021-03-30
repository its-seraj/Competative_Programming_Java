import java.util.Scanner;

class even_odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Even - Odd Finder >>>\nEnter your Number : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println(">>The given Number is Even.");
        }
        else{
            System.out.println(">>The given Number is Odd.");
        }
    }
}
import java.util.Scanner;

class char_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Convert Char to String & vice-versa >>> \nEnter a char : ");
        char c = sc.next().charAt(0);

        //Convert to String
        String s = String.valueOf(c);
        System.out.println("in String : " + s);

        //Convert to Char
        System.out.println("Enter any String : ");
        s = sc.next();
        c = s.charAt(0);
        System.out.println("in Char : " + c);
    }
}
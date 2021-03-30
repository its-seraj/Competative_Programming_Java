import java.util.Scanner;

class vowel_consonant{
    boolean check(char c){
        boolean result;
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': 
                result = true;
                break;
            default: result = false;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to check Vowel / Consonant >>>\nEnter any character : ");
        char c = sc.next().charAt(0);
        vowel_consonant obj = new vowel_consonant();
        boolean result = obj.check(c);

        if(result == true){
            System.out.println("Given character '" + c + "' is Vowel.");
        }
        else if(result == false){
            System.out.println("Given character '" + c + "' is Consonant.");
        }
    }
}
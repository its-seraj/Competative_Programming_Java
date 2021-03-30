import java.util.Scanner;

class sum_complex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pragram to Add two Compkex Numbers >>>");
        System.out.println("Enter 1st Complex Number \nReal Part : ");
        double real1 = sc.nextDouble();
        System.out.println("Imaginary Part : ");
        double imaginary1 = sc.nextDouble();
        System.out.println("Enter 2nd Complex Number \nReal Part : ");
        double real2 = sc.nextDouble();
        System.out.println("Imaginary Part : ");
        double imaginary2 = sc.nextDouble();

        //Convert into Complex Number
        Complex no1 = new Complex(real1, imaginary1);
        Complex no2 = new Complex(real2, imaginary2);

        //Calling sum mehod
        Complex obj = new Complex(0, 0);
        Complex result = obj.sum(no1, no2);

        //Displaying sum of complex Numbers
        System.out.println("Addition = " + result.real + "+" + result.imaginary + "i");
    }
}

//Class to create complex number
class Complex{
    double real, imaginary;
    Complex(double d1, double d2){
        this.real = d1;
        this.imaginary = d2;
    }
    
    //Method to add Complex Number
    Complex sum(Complex c1, Complex c2){
        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        return temp;
    }
}
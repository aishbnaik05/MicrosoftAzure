import java.util.Scanner;

class Complex
{
    int real;
    int img;
    Complex(){}
    Complex(int real,int img){
        this.real = real;
        this.img=img;
    }
    Complex sum(Complex c1, Complex c2)
    {
        Complex Sum = new Complex();
        Sum.real = c1.real+c2.real;
        Sum.img = c1.img+c2.img;
        return Sum;
    }

    Complex difference(Complex c1, Complex c2)
    {
        Complex Difference = new Complex();
        Difference.real = c1.real-c2.real;
        Difference.img = c1.img-c2.img;
        return Difference;
    }
}


public class Assignment2_Prob1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real part and imaginary part of complex number ");
        Complex c1 = new Complex(s.nextInt(),s.nextInt());
        System.out.println("Enter real part and imaginary part of complex number");
        Complex c2 = new Complex(s.nextInt(),s.nextInt());
        Complex sumResult = new Complex();
        sumResult = sumResult.sum(c1,c2);
        System.out.println("Sum : "+"("+c1.real +"+" +c1.img+"i" +")"+" + "+"(" +c2.real +"+" +c2.img+"i" +")"+" = " +sumResult.real+"+"+sumResult.img+"i");

        Complex diffResult = new Complex();
        diffResult = diffResult.difference(c1,c2);
        System.out.print("Difference : "+"("+c1.real +"+" +c1.img+"i" +")"+" - "+"(" +c2.real +"+" +c2.img+"i" +")"+" = " +diffResult.real+"-"+diffResult.img+"i");

    }
}

import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double a,b,c;
    double root1,root2;
    System.out.println("Enter the value of a,b,c in the form of the eqn. Ax^2+Bx+C :");
    a=scan.nextDouble();
    b=scan.nextDouble();
    c=scan.nextDouble();
    double delta=(b*b-4*a*c);
    if(delta>0){
    root1=(-b+Math.sqrt(delta))/(2*a);
    root2=(-b-Math.sqrt(delta))/(2*a);
    System.out.println("Root 1 is : "+root1);
    System.out.println("Root 2 is : "+root2);
	}
	else if(delta==0)
	{
	    root1 = root2 = -b / (2 * a);
        System.out.println("root1 = root2 = " + root1);
	}
	else{
    double real = -b / (2 * a);
    double imaginary = Math.sqrt(-delta) / (2 * a);
    System.out.println("root1 = " + real + " + i" +imaginary);
    System.out.println("root2 = " + real + " - i" +imaginary);
     }

   }
}

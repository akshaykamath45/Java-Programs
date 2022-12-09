import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
        int a,b;
        char c;
        System.out.println("Enter value of a :");
        a=scan.nextInt();
        System.out.println("Enter value of b :");
        b=scan.nextInt();
        System.out.println("Enter 1 to Add \nEnter 2 to Subtract  \nEnter 3 to Multiply \nEnter 4 to Divide \n");
        c=scan.next().charAt(0);
        switch(c){
            case '1':
            System.out.println(a+b);
            break;
            
            case '2':
            System.out.println(a-b);
            break;
            
            case '3':
            System.out.println(a*b);
            break;
            
            case '4':
            System.out.println(a/b);
            break;
            
        }
	}
}

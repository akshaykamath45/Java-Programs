import java.util.*;

public class Main
{

  public static int gcd (int n1, int n2)
  {

    if (n2 != 0)

      return gcd (n2, n1 % n2);

    else

      return n1;

  }

  public static int power (int x, int y)
  {

    if (y != 0)

      return (x * power (x, y - 1));

    else

      return 1;

  }

  public static int fibonacci (int n)
  {

    if (n == 0)

      return 0;

    if (n == 1 || n == 2)

      return 1;

    return fibonacci (n - 2) + fibonacci (n - 1);

  }

  public static void ReverseNum (int num)
  {

    if (num < 10)

      System.out.println (num);

    else
      {

	System.out.print (num % 10);

	ReverseNum (num / 10);

      }

  }

  public static int Add (int n)
  {

    if (n != 0)

      return n + Add (n - 1);

    else

      return n;

  }

  public static int sum_of_digit (int n)
  {

    if (n == 0)

      return 0;

    return (n % 10 + sum_of_digit (n / 10));

  }

  public static void main (String args[]) throws java.io.IOException
  {

    Scanner in = new Scanner (System.in);

    char choice;

   System.out.println("Menu Program :\n 1.To find GCD and LCM \n 2.To find X^y  \n 3.To print n Fibonacci numbers \n 4.To find reverse of number \n 5.To find 1+2+3+4...+(n-1)+n \n 64.Calculate sum of digits of a number \n");
      System.out.println ("Enter your choice : ");

      choice = (char) System.in.read ();

    switch (choice)
      {

      case '1':

	System.out.println ("Finding GCD and LCM of 2 numbers : ");

	int n1, n2;

	  System.out.println ("Enter 2 numbers : ");

	  n1 = in.nextInt ();

	  n2 = in.nextInt ();

	int gcd = gcd (n1, n2);

	int lcm = (n1 * n2) / gcd;

	  System.out.printf ("G.C.D of %d and %d is %d.\n", n1, n2, gcd);

	  System.out.printf ("L.C.M of %d and %d is %d.", n1, n2, lcm);

	  break;

	case '2':System.out.println ("Value of X^Y is : ");

	int x, y;

	  System.out.print ("Enter the value of X : ");

	  x = in.nextInt ();

	  System.out.print ("Enter the value of Y : ");

	  y = in.nextInt ();

	int result = power (x, y);

	  System.out.println ("The value of " + x + "^" + y + "=" + result);

	  break;

	case '3':System.out.println ("Fibonnaci numbers are : ");

	  System.out.print ("Enter the number of terms : ");

	int n;

	  n = in.nextInt ();

	  System.out.println ("The fibbonaci series upto " + n + " numbers is: ");

	for (int i = 0; i < n; i++)
	  {

	    System.out.print (fibonacci (i) + " ");

	  }
	break;

      case '4':

	System.out.println ("Reversing a number : ");

	int num;

	System.out.print ("Enter a number to be reversed : ");

	num = in.nextInt ();

	System.out.print ("The reverse of " + num + " is ");

	ReverseNum (num);

	break;

      case '5':

	System.out.println ("Sum upto N numbers : ");

	int numb;

	System.out.print ("Enter n numbers upto which sum is to be found:");

	numb = in.nextInt ();

	int sum = Add (numb);

	System.out.println ("The sum upto " + numb + " numbers is :" + sum);

	break;

      case '6':

	System.out.println ("Sum of digits of a Number : ");

	int number;

	System.out.print ("Enter a number : ");

	number = in.nextInt ();

	int sumdig = sum_of_digit (number);

	System.out.println ("The sum of digits of " + number + " is " +
			    sumdig);

	break;

      default:

	System.out.println ("Incorrect Input");

	break;

      }

  }

}

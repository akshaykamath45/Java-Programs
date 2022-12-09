import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    int no, i;
    Scanner sc = new Scanner (System.in);
      System.out.println ("No of Elements in Vector : ");
    int n = sc.nextInt ();
    Vector v = new Vector (n);
    for (i = 1; i <= n; i++)
      {
	//   Commented lines for  case for i=0 to n;
	//      no = i + 1;
	System.out.print ("element " + i + " : ");
	//      System.out.print ("element " + no+ " : ");
	String element = sc.next ();
	  v.addElement (element);	//Adding Elements Accordingly
      }
    System.out.println ("Vector : " + v);	//Displaying Vector
    System.out.print ("Find frequency of element : ");
    String z = sc.next ();
    int count = Collections.frequency (v, z);	//Calculating frequency
    System.out.println ("Find frequency of element " + z + " is " + count);
  }
}

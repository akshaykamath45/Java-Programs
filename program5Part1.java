import java.util.*;
public class Main
{
  static String swap (String str, int i, int j)
  {
    char arr[] = str.toCharArray ();
    char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      return str.valueOf (arr);
  }
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    String str1, str2, temp;
    int i, j, n = 0;
    System.out.print ("Enter first word: ");
    str1 = in.nextLine ();
    System.out.print ("Enter second word: ");
    str2 = in.nextLine ();
    if (str1.length () == str2.length ())
      {
	for (i = 0; i < str1.length (); i++)
	  {
	    for (j = 0; j < str1.length (); j++)
	      {
		temp = swap (str1, i, j);
		if (temp.equals (str2))
		  {
		    System.out.println ("They are a pair of Meta strings.");
		    n = 1;
		    break;
		  }
	      }
	    if (n == 1)
	      {
		break;
	      }
	  }
      }
    if (n == 0)
      {
	System.out.println ("They are not a pair of Meta strings.");
      }
  }
}

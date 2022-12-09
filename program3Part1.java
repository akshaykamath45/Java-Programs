//No of Digits should be Even-n
// eg 1260

// Divide the number into i parts such that its n/2
// 21 and 60

// combination of the numbers should be same as original


import java.util.*;
public class Main
{

  public static void main (String z[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter a four digit number: ");
    int i, j, k, l, temp, num;
      num = sc.nextInt ();
      temp = num;
    int[] arr = new int[4];
    for (i = 0; i < 4; i++)
      {
	arr[i] = temp % 10;
	temp /= 10;
      }
    for (i = 0; i < 4; i++)
      {
	for (j = 0; j < 4; j++)
	  {
	    if (i != j)
	      {
		for (k = 0; k < 4; k++)
		  {
		    if (k != i && k != j)
		      {
			for (l = 0; l < 4; l++)
			  {
			    if (l != i && l != j && l != k)
			      {
				if ((10 * arr[i] + arr[j]) * (10 * arr[k] +
							      arr[l]) == num)
				        {
				    System.out.print (num +
						      " is a Vampire Number");
				    System.exit (0);
				         }
			       }
			    }
		      }
		    }
	      }
	    }
      }
    System.out.print (num + " is not a Vampire Number");


  }
}

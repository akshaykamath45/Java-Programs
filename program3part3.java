import java.util.*;
public class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    int row, col, i, j, sum = 0;
      System.out.println ("Enter the number of rows : ");
      row = in.nextInt ();
      System.out.println ("Enter the number of columns : ");
      col = in.nextInt ();
    int[][] arr = new int[(row + 1)][(col + 1)];
    for (i = 0; i < row + 1; i++)
      {
	for (j = 0; j < col + 1; j++)
	  {
	    if (j != col && i != row)
	      {
		System.out.println ("Enter element value : ");
		arr[i][j] = in.nextInt ();
		sum = sum + arr[i][j];
	      }
	    else
	      {
		arr[i][j] = 0;
	      }
	  }
      }
    for (i = 0; i < row + 1; i++)
      {
	for (j = 0; j < col + 1; j++)
	  {
	    if (j != col && i != row)
	      {
		arr[i][col] = arr[i][col] + arr[i][j];
		arr[row][j] = arr[row][j] + arr[i][j];
	      }
	    else
	      {
		arr[row][col] = sum;
	      }
	  }
      }
    for (i = 0; i < row + 1; i++)
      {
	for (j = 0; j < col + 1; j++)
	  {
	    System.out.print (arr[i][j] + "\t");
	  }
	System.out.println (" ");
      }
  }
}

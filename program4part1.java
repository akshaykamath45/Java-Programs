import java.util.*;
public class Main
{
  public static void main (String z[])
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("How many items are there in List : ");
    int n = in.nextInt ();
    Vector v = new Vector (n, 3);
    for (int i = 0; i < n; i++)
      {
	System.out.printf ("Enter item %d : ", (i + 1));
	String str = in.next ();
	  v.addElement (str);
      }
    System.out.println ("Choose an action to perform");
    System.out.println ("1. Add an item ");
    System.out.println ("2. Delete an item ");
    System.out.println ("3. Display all items ");
    System.out.println ("4. Exit");
    int choice = 1;
    while (choice != 3)
      {
	System.out.println ("Enter your choice : ");
	choice = in.nextInt ();
	if (choice == 1)
	  {
	    System.
	      out.println ("Enter the location of the item to be added : ");
	    int pos = in.nextInt ();
	    System.out.println ("Enter the item : ");
	    String item = in.next ();
	    v.add ((pos - 1), item);
	    System.out.println ("Elements in the list are " + v);
	  }
	else if (choice == 2)
	  {
	    System.out.println ("Enter the item to be deleted : ");
	    String items = in.next ();
	    v.remove (items);
	  }
	else if (choice == 3)
	  {
	    System.out.println ("Items in the list are " + v);
	  }
	else
	  {
	    System.out.println ("Wrong choice");
	  }
      }
  }
}

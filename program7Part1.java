import java.util.*;

public class Area
{

  double sq, rect;

    Area (double side)
  {

    sq = side * side;

    System.out.println ("Area of Square is " + sq + " sq units ");

  }
  Area (double len, double width)
  {

    rect = len * width;

    System.out.println ("Area of Rectangle is " + rect + " sq units ");

  }
  public static void main (String args[])
  {

    System.out.println ("Enter length of square : ");

    Scanner in = new Scanner (System.in);

    double s = in.nextDouble ();

    System.out.println ("Enter the length and breadth of Rectangle : ");

    double len = in.nextDouble ();

    double br = in.nextDouble ();

    Area obj = new Area (s);

    Area obj1 = new Area (len, br);

  }
}

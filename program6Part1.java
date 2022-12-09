//Function overloading-class has multiple methods having the same name,but diferent parameters

import java.util.*;
class Main
{
  float sq;
  float rect;
  void area (float x)
  {
    sq = x * x;
    System.out.println ("Area of Square is " + sq + " sq units ");
  }
  void area (float l, float b)
  {
    rect = l*b;
    System.out.println ("Area of Rectangle is " + rect + " sq units");
  }
  public static void main (String args[])
  {
    Main obj = new Main ();//Creating object for the main
    System.out.println ("Enter length of square : ");
    Scanner in = new Scanner (System.in);
    float s = in.nextFloat ();
    System.out.println ("Enter the length and breadth of Rectangle : ");
    float len = in.nextFloat ();
    float br = in.nextFloat ();
    obj.area (s);
    obj.area (len, br);
  }
}

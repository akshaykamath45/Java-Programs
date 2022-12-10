import java.util.*;

abstract class areaOfShape
{
    double length1;
    double length2;
    areaOfShape(double l1,double l2){
        length1=l1;
        length2=l2;
    }
    abstract double area();
    
}
class Circle extends areaOfShape
{
    Circle(double r)
    {
        super (r,0);
    }
    double area(){
        return (3.14*length1*length1);
    }
}
class Rectangle extends areaOfShape{
    Rectangle(double l1,double l2){
        super (l1,l2);
    }
    double area(){
        return (length1*length2);
    }
}
class Triangle extends areaOfShape{
    Triangle(double l1,double l2){
        super(l1,l2);
    }
    double area(){
        return (0.5*length1*length2);
    }
}


public class Main{
        public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter radius of Circle : ");
    double r = in.nextDouble ();
    Circle c = new Circle (r);
    System.out.printf ("Area of Circle is : %.4f sq.units", c.area ());
    System.out.println ("\nEnter length of Rectangle : ");
    double l = in.nextDouble ();
    System.out.println ("Enter breadth of Rectangle : ");
    double b = in.nextDouble ();
    Rectangle rectarea = new Rectangle (l, b);
    System.out.printf ("Area of Rectangle is : %.4f sq.units",rectarea.area ());
    System.out.println ("\nEnter height of Triangle: ");
    double h = in.nextDouble ();
    System.out.println ("Enter base length of Triangle : ");
    double base = in.nextDouble ();
    Triangle triarea = new Triangle (h, base);
    System.out.printf ("Area of Triangle is : %.4f sq.units",
    triarea.area ());

  }
    
}

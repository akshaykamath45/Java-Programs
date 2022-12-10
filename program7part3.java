import java.util.*;

class Rectangle{

	int length;
	int breadth;

	Rectangle(){
	   // length = 2;
        // breadth = 2;

	}
	Rectangle(int length1,int breadth1){
	
		length=length1;
	      breadth=breadth1;
	}
	int area(){
		return length*breadth;

	}

}

class Cube{

	int side;

	Cube(){
	
        //side = 2;
	}
	Cube(int side1){
	
		side=side1;
	}
	int volume(){
		return side*side*side;

	}

}

class Size{

	int calcSize(Object obj){

	if(obj instanceof Cube){
	return ((Cube) obj).volume ();

	}
	if(obj instanceof Rectangle){

		return((Rectangle) obj).area();
	}
	else{
		return -1;
	}

  }
}
public class constructorOverloading{

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("For Cube :");
	System.out.println("Enter side :");
	int s=sc.nextInt();
	System.out.println("For Rectangle :");
	System.out.println("Enter length:");
	int l=sc.nextInt();
	System.out.println("Enter breadth : ");
	int b=sc.nextInt();
	Cube cu=new Cube(s);
	Rectangle rec=new Rectangle(l,b);
	Size size=new Size();
    	int isCube = size.calcSize (cu);
      System.out.println ("Volume of cube is : " + isCube);
    	int isRect = size.calcSize (rec);
      System.out.println ("Area of Rectangle is : " + isRect);
	


	}

}

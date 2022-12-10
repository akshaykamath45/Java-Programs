import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int seatno,date,center_no,marks;
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter date : ");
		date=sc.nextInt();
		System.out.println("Enter centre no : ");
		center_no=sc.nextInt();
		System.out.println("Enter marks : ");
		try{
	
		marks=sc.nextInt();
		if(marks<0 || marks>100){
		    throw new MarksOutOfBoundsException();
		}
		System.out.println("Marks entered are valid,Good");
		}
		catch (MarksOutOfBoundsException e){
		    System.out.println("Invalid Marks,Retry Again");
		}
	    
	}
}
class MarksOutOfBoundsException extends Exception
{
    MarksOutOfBoundsException(String s)
    {
        System.out.println(s);
    }
}

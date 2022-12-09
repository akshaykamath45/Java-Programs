// Important to Remember: 
// use == while using || for alphabets
// use == while using ' ' for spaces

// Methods:
// charAt()
// toLowerCase()

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line : ");
		String line=sc.nextLine();
		int v=0,c=0,d=0,s=0,ss=0;
		line=line.toLowerCase();
		for(int i=0;i<line.length();i++){
		    char ch=line.charAt(i);
		    if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		    {
		        v++;
		    }
		    else if(ch>='a' && ch<='z' || ch>='a' && ch<='z'){
		        c++;
		    }
		    else if(ch>='0'&& ch<='9'){
		        d++;
		    }
		    else if(ch ==' '){
		        s++;
		    }
		    else{
		        ss++;
		    }
		    }
		 System.out.println("Number of Vowels are : "+v);
		 System.out.println("Number of Consonats are : "+c);
		 System.out.println("Number of Digits are : "+d);
		 System.out.println("Number of Spaces are : "+s);
     System.out.println("Number of Special Symbols  are : "+ss);
		}
	}

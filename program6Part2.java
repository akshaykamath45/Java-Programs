//Remember for Reverse,the function type would be void

import java.util.*;
public class recursive{

	public static int gcd(int n1,int n2){
		
		if(n2!=0){
			return gcd(n2,n1%n2);

		}	
		else{
			return n1;
		}
	
	
	}
	public static int power(int x,int y){
		if(y!=0){
			return (x*power(x,y-1));
		}
		else{
			return 1;
		}
	
	}
	public static int fibonacci(int n){
		if(n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void reverse(int num){

		if(num<10){
			System.out.println(num);
		}
		else{
		System.out.print(num%10);
		 reverse(num/10);
		}
		
	}
	public static int add(int n){
		if(n!=0){
			return n+add(n-1);
		}
		else{
			return n;	
		}
	}
	public static int sum_of_digits(int n){
	
	if(n==0){
		return 0;
	}
	else{
		return(n%10+sum_of_digits(n/10));
	}


}

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter 1 for GCD & LCM\nEnter 2 for finding power\nEnter 3 for finding Fibonacci Series\nEnter 4 for reversing number\nEnter 5 for adding\nEnter 6 for sum of digits\n");
		ch=sc.next().charAt(0);;
		switch(ch){

			case '1':
			{
				System.out.println("Finding GCD & LCM");
				int n1,n2;
				System.out.println("Enter 1st Number :");
				n1=sc.nextInt();
				System.out.println("Enter 2nd Number :");
				n2=sc.nextInt();
				int gcd=gcd(n1,n2);
				int lcm=(n1*n2)/gcd;
				System.out.println("GCD of two number is : "+gcd);
				System.out.println("LCM of two nmbers is : "+lcm);
				break;	
				
			}
			case '2':
			{
				System.out.println("Finding Powers");
				int x,y;
				System.out.println("Enter x :");
				x=sc.nextInt();
				System.out.println("Enter y:");
				y=sc.nextInt();
				int power=power(x,y);
				System.out.println(x+"to the power"+y+"is "+power);
				
				break;	
				
			}

			case '3':
			{
				System.out.println("Find Fibonacci upto n terms");
				int n;
				System.out.println("Enter number of terms");
				n=sc.nextInt();
				for(int i=0;i<n;i++){
					System.out.println(fibonacci(i));

				}
				
				break;	
			}
			case '4':
			{
				System.out.println("Reversing a number");
				int num;
				System.out.println("Enter a number to be reversed :");
				num=sc.nextInt();
				
				System.out.println("Reverse number of "+num +" is : ");
				reverse(num);
				
				break;	
			}
			case '5':
			{
				System.out.println("Sum upto N Numbers");
				int n;
				System.out.println("Enter number of terms");
				n=sc.nextInt();
				int sum=add(n);
				System.out.println("SUm upto "+n+" terms is : "+sum);
				
				
				break;	
			}
			case '6':
			{
				System.out.println("Sum  of Digits");
				int n;
				System.out.println("Enter a number");
				n=sc.nextInt();
				int sod=sum_of_digits(n);
				System.out.println("Sum of the digits of the number "+n+" is "+sod);
			
				break;	
			}





		}		
	
	}



}

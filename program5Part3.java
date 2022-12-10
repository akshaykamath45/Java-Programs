import java.util.*;

import java.util.Scanner;

class Student{
    int p,c,m,total,rollno;
    String name;
	
	Scanner sc=new Scanner(System.in);
	void input(){

		System.out.println("Enter your name : ");
		name=sc.nextLine();
		System.out.println("Enter your Roll No : ");
	    rollno=sc.nextInt();
		System.out.println("Enter your marks in Physics : ");
		p=sc.nextInt();
		System.out.println("Enter your marks in Chemistry : ");
		c=sc.nextInt();
		System.out.println("Enter your marks in Maths : ");
		m=sc.nextInt();
	   total=p+c+m;

	}
	void output(){

	System.out.println("Name "+ name +",Roll No : "+rollno+" ,Marks");

	System.out.println("Physics "+p);
	System.out.println("Chemistry "+c);
	System.out.println("Maths "+m);
	System.out.println("Total "+total);


	}

}

class Main{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  number of students ");
	int num=sc.nextInt();
	Student s[]=new Student[num];
	Student temp;
	 for (int i = 0; i < num; i++)
      {
	s[i] = new Student();
      }
	for(int i=0;i<num;i++){
		s[i].input();
	
	}
	for(int i=0;i<num;i++){
		s[i].output();
	
	}
	for(int i=0;i<num-1;i++){

		for(int j=0;j<(num-1)-i;j++){

			if(s[j].total<s[j+1].total){

			temp=s[j];
			s[j]=s[j+1];
			s[j+1]=temp;	

			}
		}
	
	}

	System.out.println("In descending order:");
	for(int i=0;i<num;i++){
		System.out.println("Student name "+s[i].name+",Roll no :"+s[i].rollno+",Total: "+s[i].total);
	}
	
  }


}

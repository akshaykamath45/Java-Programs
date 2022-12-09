import java.util.*;
import java.util.Scanner;
class program2Part3
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
  
        int count=0;
        System.out.println("Enter start"); 
        int start=scan.nextInt();
        System.out.println("Enter End :");
        int end=scan.nextInt();
        for(int i=start;i<=end;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        System.out.println("Prime numbers in the given range are \n");
        for(int i=start;i<=end;i++){
            count=0;
            for(int n=i;n>=1;n--){
                if(i%n==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
	}
}
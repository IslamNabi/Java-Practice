import java.util.Date;  
import java.util.Scanner;   
class Factorial_Iterative   
{  
  public static void main(String[] argvs)   
  { 
	Date start = new Date();
	//finding factorial of a number by using loop
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = sc.nextInt();
	long factorial = 1;
	for(int i=num; i>=1; i--){
		factorial = factorial*i;
	}
	System.out.println("Factorial of Number: "+factorial);
	Date end = new Date();
	System.out.println("\nTime taken: "+(end.getTime()-start.getTime())/1000+" seconds");
  }      
} 
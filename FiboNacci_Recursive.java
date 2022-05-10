import java.util.Scanner;
import java.util.Date;
class FiboNacci_Recursive
{
	static void fibonacci(long n, long n1, long n2, long next){
	
		if(n == 0){
		return;
		}
		else
		{
			System.out.print(next+" ");
			n1 = n2;
			n2 = next;
			next = n1+n2;
			fibonacci(n-1, n1, n2,next);
		}
	}
	public static void main (String arg[])
	{
		Date start = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		long num = sc.nextInt();
		long num1 = 0;
		long num2 = 1;
		long next = num1+num2;
		System.out.print(num1+" "+num2+" ");
		fibonacci(num-2 , num1, num2, next);
		Date end = new Date();
		System.out.println("\nTime Taken: "+(end.getTime()-start.getTime())/1000+" Seconds");
	}
}
import java.util.Scanner;
import java.util.Date;
class FiboNacci_iterative
{
	public static void main(String arg[])
	{
		Date start = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Terms: ");
		int n = sc.nextInt();
		long num1 = 0;
		long num2 = 1;
		long next = num1+num2;
		
		System.out.print(num1+" "+num2+" "+next+" ");
		for(int i=3; i<n; i++){
			num1 = num2;
			num2 = next;
			next = num1+num2;
			System.out.print(next+" ");
		}
		Date end = new Date();
		System.out.println("\nTime Taken: "+(end.getTime()-start.getTime())/1000+" Seconds");
	}
}
import java.util.Date; 
import java.util.Scanner;
class Fact_Recursive
{
	static long fact(int num)
	{
		long factorial2=1;
		if(num == 1){
			return 1;
		}
		else
		{
			factorial2 = num*fact(num-1);
		}
		return factorial2;
	}
	public static void main(String arg[])
	{
		Date start = new Date();
		//finding factorial by recursion
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		long res = fact(num);
		Date end = new Date();
		System.out.println("Fact is: "+res);
		System.out.println("\nTime taken: "+(end.getTime()-start.getTime())/1000+" seconds");
	}
}
import java.util.Scanner;
class Clinks
{
	static int numberOfClinks(int n){
		if(n == 0 || n == 1){
			return 0;
		}
		else
		{
			return ((n*(n-1))/2);
		}
	}
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Guests: ");
		int n = sc.nextInt();
		int res = numberOfClinks(n);
		System.out.println("Number of Clinks: "+res);
	}
}
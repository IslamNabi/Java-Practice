import java.util.*;
class DuplicateCharInString
{
	public static void main (String cmd[])
	{
		Scanner sc = new Scanner (System.in);
		int count=0;
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter a Char to find Number of Duplicate: ");
		char a = sc.next().charAt(0);
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==a || str.charAt(i)==Character.toUpperCase(a))
			count++;
		}
		System.out.println("Total Duplicates are: "+count);

	}
}
class CharArrayToStringArray
{
	public static void main (String arg[])
	{
		char[] arr1 = {'a','b','c','d'};
		String[] arr2 = new String [4];
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i]=Character.toString(arr1[i]);
		}
		System.out.println("Words in Array of String are: ");
		for(int j=0; j<arr2.length; j++)
		{
			System.out.println(arr2[j]);

		}
	}
}
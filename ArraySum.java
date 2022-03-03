class ArraySum
{
	public static void main (String[] arg){
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,10};
		System.out.println("Sum of given Array is: ");
		int res;
		res = sum_array(arr);
		System.out.println(res);		
	}

	public static int sum_array(int[] a){
		
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum +a[i];
		}
			return sum; 
	}		

	
}
class MergeTwoArrays
{
	public static void main (String arg[])
	{
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {6,7,8,9,10};
		int size1 = array1.length;
		int size2 = array2.length;
		int size3 = size1+size2;
		int[] array3 = new int[size3];
		int i=0;
		for(i=0; i<size1; i++){
			array3[i] = array1[i];
		}
		
		for(int j=0; j<size2; j++){
			array3[i] = array2[j];
			i++;
		}
		
		for(int k=0; k<size3; k++){
			System.out.print(array3[k]+" ");
		}

	}
}	
import java.util.Scanner;
class SortedArray {
  		public static void main (String arg[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of Array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
			System.out.println("Enter Elements of Array: ");
            for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
            }
			 //printing original array
			System.out.println("Original Array: ");
            for(int i=0; i<n; i++){
				System.out.print(arr[i]);
            }
            //sorting array using for loop
            for(int i=0; i<n; i++){
				for(int j=i+1; j<n; j++){
					int temp=0;
                    if(arr[i] > arr[j]){
						temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            //printing sorted array
			System.out.println("\nSorted Array: ");
            for(int i=0; i<n; i++){
				System.out.print(arr[i]);
            }
            
        }
 }
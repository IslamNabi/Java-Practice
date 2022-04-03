import java.util.Scanner;

/*Algorithm 
Step 1: Read User Input
Step 2: Find Binary of Number
Step 3: Store Binary in a String
Step 3: Reverse the Binary
Step 4: Convert the reverse binary int Decimal
*/

class ReverseBits
{
	public static String binary="";
	//convert into Binary
	public static void convertIntoBinary(int n){
		while(n > 0){
			binary += n%2;
			n = n/2;
		}
		for(int i=binary.length()-1; i>=0; i--){
			System.out.print(binary.charAt(i)+" ");
		}
	}
	
	public static int convertBinaryIntoDecimal(){
		int decimal = 0;
		int count =-1;
		for(int i=binary.length()-1; i>=0; i--){
			if(binary.charAt(i) == '0'){
				count++;
			}
			else if(binary.charAt(i) == '1'){
				count++;
				decimal += Math.pow(2,count);
			}
		}
	return decimal;	
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number: ");
		System.out.println("------------------------");
		int num = sc.nextInt();
		System.out.println("\nBinary of Given Number: ");
		System.out.println("-------------------------");
		convertIntoBinary(num);
		System.out.println("\nReversing Binary Number: ");
		System.out.println("-------------------------");
		for(int i=0; i<binary.length(); i++){
			System.out.print(binary.charAt(i)+" ");
		}

		System.out.println("\nDecimal of Reversed Binary Number: ");
		System.out.println("------------------------------------");
		System.out.println(convertBinaryIntoDecimal());
	}
}
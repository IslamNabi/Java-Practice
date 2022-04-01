class Euler_02 {
   public static void main(String[] args) {    
    int num1 = 0;
    int num2 = 1;
    int next = 0;
    int sum = 0;
	
	while(num2<4000000){
		if(num2%2 == 0){
			sum+=num2;
		}
		next = num1+num2;
		num1 = num2;
		num2 = next;
	}
	System.out.println(sum);

   }
}
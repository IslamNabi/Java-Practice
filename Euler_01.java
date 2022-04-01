class Euler_01 {
    public static void main (String arg[]){
        System.out.println("Hello");
        int target = 1000;
        int i = 0;
        int sum = 0;
        while(i<target){
         if(i%3 == 0 || i%5 == 0){   
            sum = sum+i;
         }
         i++;   
        }
        System.out.println("Total Sum is "+sum);
    }
}
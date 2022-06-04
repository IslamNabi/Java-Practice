import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class ClosestTemp
{
	static double findClosestTemp(ArrayList<Double> list){
		if(list.isEmpty()){
			return 0;
		}
		else
		{
			ArrayList<Double> temps = new ArrayList<Double>();
			for(int i=0; i<list.size(); i++){
				double diff = Math.abs(list.get(i)-0);
				temps.add(diff);
			}
			return Collections.min(temps);
		}
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Temperatures to analyze: ");
		int n = sc.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("Enter "+n+" Temperatures: ");
		for(int i=0; i<n; i++){
			double tem = sc.nextDouble();
			list.add(tem);
		}
		System.out.println("Minimum Temperature: "+findClosestTemp(list));
		
	}
}	
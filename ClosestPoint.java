import java.util.Scanner;
import java.util.Arrays;
class Point
{
	int x , y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class ClosestPoint 
{

	public static void main (String arg[])
	{
		Point origin = new Point(0,0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of input Points: ");
		int n = sc.nextInt();
		Point[] arr = new Point[n];
		System.out.println("Enter "+n+" Points: ");
		for(int i=0; i<arr.length; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			Point p = new Point(x,y);
			arr[i] = p;
		}
		double[] disArr = new double[n];
		for(int i=0; i<arr.length; i++){
			Point p = arr[i];
			double dis = Math.sqrt(Math.pow((p.x - origin.x), 2) + Math.pow((p.y - origin.y), 2));
			disArr[i] = dis;
		}
		for(int k=0; k<disArr.length; k++){
			
			System.out.println(disArr[k]);
		}
		double min = disArr[0];
		int index =0;
		for(int l=0; l<disArr.length; l++){
			if(disArr[l]<min){
				min = disArr[l];
				index = l;
			}
		}
		Point point = arr[index];
		System.out.println("Closest Point to (0,0): ");
		System.out.println(point.x+","+point.y);

	}
}
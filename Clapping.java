
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class Clapping {
    public static void main(String arg[])
    {
      ArrayList<Integer> list = new ArrayList<Integer>();
      try {
      File myObj = new File("C:\\Users\\Islam\\Desktop\\file.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNext()) {
        String data = myReader.next();
        int val = Integer.parseInt(data);
        list.add(val);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    int size = list.size();
    System.out.println(list.get(0));
    int index = 1;
    for(index = 1; index<size; index++){
        int sum =0;
        int n = list.get(index);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n!=0){
          int d = n%10;
          arr.add(d);
          n = n/10;
          sum = sum+d;
        }
        if(sum%7 == 0){
            System.out.println("CLAP");
            continue;
           }
       else if(list.get(index)%7 == 0){
            System.out.println("CLAP");
            continue;
        }
       else if(arr.contains(7)){
            System.out.println("CLAP");
            continue;   
       }
       System.out.println(list.get(index));      
    }
    
    }
}

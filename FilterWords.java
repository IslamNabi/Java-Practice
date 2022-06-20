import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
class FilterWords
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
	try {
      File myObj = new File("C:\\Users\\Islam\\Desktop\\file.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNext()) {
        String data = myReader.next();
        list.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	System.out.println("List of Words: ");
	System.out.println(list);
	System.out.println("Enter letters to filter: ");
	String letters = sc.next();
	ArrayList<String> list2 = new ArrayList<String>();
	for(int i=0; i<list.size(); i++){
		boolean bool = false;
		String word = list.get(i);
		for(int j=0; j<letters.length(); j++){
			if(!(word.contains(Character.toString(letters.charAt(j))))){
				continue;
			}
			else{
				bool = true;
			}
		}
		if(bool != true){
			list2.add(word);
		}
	}
	System.out.println("Filtered Words From List: ");
	System.out.println(list2);
	
	}
}
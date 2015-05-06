import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator{
	
	public static void main(String[] args){
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Apple");
		myList.add("Orage");
		myList.add("Milk");
		myList.add("Curd");
		myList.add("Cream");
		
		Iterator<String> itr = myList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

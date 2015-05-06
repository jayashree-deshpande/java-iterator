/**
 *  to remove an element from collection object using Iterator object
**/

import java.util.*;

public class RemoveElementbyUsingItr{
	
	public static void main(String[] args)
	{
		String myStr = "Milk";
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Apple");
		myList.add("Orage");
		myList.add("Milk");
		myList.add("Curd");
		myList.add("Cream");
		myList.add("Cake");
		
		System.out.println("Before remove:");
        System.out.println(myList);
        
		Iterator<String> itr = myList.iterator();
		
		while(itr.hasNext())
		{
			if(myStr.equals(itr.next()))
				itr.remove();
		}
		System.out.println("After remove:");
        System.out.println(myList);
		
	}
}

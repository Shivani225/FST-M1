package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Green");
		myList.add("Yellow");
		myList.add("Red");
		myList.add("Black");
		myList.add("Blue");
		
		System.out.println("List of the colors: ");
		for(String s:myList) {
			System.out.println(s);
		}
		
        System.out.println("Third Color in the List is: " + myList.get(2));
        System.out.println("Is Blue in the List: " + myList.contains("Blue"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Black");	
        System.out.println("New Size of ArrayList: " + myList.size());

	}

}

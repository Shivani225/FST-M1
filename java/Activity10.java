package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Table");
		hs.add("Chair");
		hs.add("Television");
		hs.add("Mobile");
		hs.add("Refrigerator");
		hs.add("AC");
		
		System.out.println("Original HashSet is: " +hs);
		
		System.out.println("Size of the HashSet is: " +hs.size());
		System.out.println("Size of the HashSet is: " +hs.remove("Mobile"));
		
		if(hs.remove("Charger"))
		{
		System.out.println("Charger is removed from HashSet");
		}
		else {
			System.out.println("Charger is not present in HashSet");
		}
		
		System.out.println("If AC is present in the HashSet" +hs.contains("AC"));
		
		System.out.println("Updated HashSet is: " +hs);
		
	}

}

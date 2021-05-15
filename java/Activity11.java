package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Blue");
		hm.put(2, "Red");
		hm.put(3, "Green");
		hm.put(4, "Yellow");
		hm.put(5, "Violet");
		
        System.out.println("The Original map: " + hm);
        hm.remove(4);
        System.out.println("After removing one color: " + hm);
	    if(hm.containsValue("Green")) {	
            System.out.println("Green exists in the Map");	
        } else {
            System.out.println("Green does not exist in the Map");	
        }
	    System.out.println("Number of pairs in the Map is: " + hm.size());  

	}

}

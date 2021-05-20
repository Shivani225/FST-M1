package activities;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
	
	static ArrayList<String> List;
	
	@BeforeAll
	public void setUp() {
		
		List = new ArrayList<String>();
		List.add("Alpha");
		List.add("Beta");
		
	}
	
	@Test
	public void insertTest() {
		
		assertEquals(2,List.size(),"Wrong Size");
		List.add("Gamma");
		assertEquals(3,List.size(),"Wrong Size");
		assertEquals("Alpha",List.get(0),"Wrong Element");
		assertEquals("Beta",List.get(1),"Wrong Element");
		assertEquals("Gamma",List.get(2),"Wrong Element");
		
	}
    
	@Test
	public void replaceTest() {
		
		assertEquals(2,List.size(),"Wrong Size");
		List.add("Lamda");
		assertEquals(3,List.size(),"Wrong Size");
		List.set(1,"Theta");
		assertEquals("Alpha",List.get(0),"Wrong Element");
		assertEquals("Theta",List.get(1),"Wrong Element");
		assertEquals("Gamma",List.get(2),"Wrong Element");
		assertEquals("Lamda",List.get(2),"Wrong Element");
		
	}
}

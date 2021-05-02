package activities;

public class JavaActivity2 {

	public static void main(String[] args) {
		
		int numList[] = {10,77,10,54,-11,10};
		
		int s10 = 0;
		int expResult = 30;
		
		for(int i = 0;i <= numList.length-1;i++)
		{
			if (numList[i] == 10)
			{
				int s = numList[i];
				s10 = s10 + s;
				
			}
			
			}
		
		if (s10 == expResult)
		
			System.out.println("Sum of all the 10s in array is " +expResult);
		
		else
			
			System.out.println("Sum of all the 10s in array is not " +expResult);
		

	}

}

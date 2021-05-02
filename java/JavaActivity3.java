package activities;

public class JavaActivity3 {

	public static void main(String[] args) {
		
		double seconds = 1000000000;
		double earthSeconds = 31557600;
		double mercurySeconds = 0.2408467;
		double venusSeconds = 0.61519726;
		double marsSeconds = 1.8808158;
		double jupiterSeconds =11.862615;
		double saturnSeconds = 29.447498;
		double uranusSeconds = 84.016846;
		double neptuneSeconds = 164.79132;
		
		System.out.println("Age in Earth is "+seconds/earthSeconds+" Earth-years old.");
		System.out.println("Age in Mercury is "+seconds/earthSeconds/mercurySeconds+" Earth-years old.");
		System.out.println("Age in Venus is "+seconds/earthSeconds/venusSeconds+" Earth-years old.");
		System.out.println("Age in Mars is "+seconds/earthSeconds/marsSeconds+" Earth-years old.");
		System.out.println("Age in Jupiter is "+seconds/earthSeconds/jupiterSeconds+" Earth-years old.");
		System.out.println("Age in Saturn is "+seconds/earthSeconds/saturnSeconds+" Earth-years old.");
		System.out.println("Age in Uranus is "+seconds/earthSeconds/uranusSeconds+" Earth-years old.");
		System.out.println("Age in Neptune is "+seconds/earthSeconds/neptuneSeconds+" Earth-years old.");

	}

}

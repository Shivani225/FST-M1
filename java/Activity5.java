package activities;

abstract class Book {
	String title;
	
	abstract void setTitle(String x);
		
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	
	public void setTitle(String x) {
		title = x;
	}
	
}

public class Activity5 {

	public static void main(String[] args) {
		String title = "NoteBook";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);
		String T = newNovel.getTitle();
		
		System.out.println("Title of the new Novel is "+T);

	}

}

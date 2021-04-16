package PackageA;

import java.time.Year;


public class Video implements Comparable<Video>{
	private String title;
	private int year;
	public Video() {
		title="";
		year=0;
	}
	public Video(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if (!title.isEmpty())
			this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public static boolean yearValidation(int year) {
		int cYear = Year.now().getValue();
		if (year<=cYear) return true;
		return false;
	}
	
	public static boolean titleValidation(String title) {
		if(title.isEmpty()) return false;
		return true;
	}
	@Override
	public int compareTo(Video o) {
		// TODO Auto-generated method stub
		if(title.compareTo(o.getTitle())>0)return -1;
		else if(title.compareTo(o.getTitle())<0)return 1;
		return 0;
	}

	
}

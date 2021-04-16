package A;

public class Course {
	private String name;
	private int Hours;
	public Course() {
		name="";
		Hours=0;
	}
	public Course(String name, int hours) {
		super();
		this.name = name;
		Hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return Hours;
	}
	public void setHours(int hours) {
		Hours = hours;
	}
	
}

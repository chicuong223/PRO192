package A;

import java.util.Comparator;



public class Star implements Comparable<Star>{
	private String name;
	private String gender;
	public Star() {
		name="";
		gender="";
	}
	public Star(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static boolean nameValidation(String name){
		if(name.isEmpty()) return false;
		return true;
	}
	
	public static boolean genderValidation(String gender){
		if(!gender.equals("male") && !gender.equals("female")) return false;;
		return true;
	}
	//create a class Comparator to compare stars' names
	public static Comparator<Star>byName=new Comparator<Star>() {
		@Override
		public int compare(Star o1, Star o2) {
			// TODO Auto-generated method stub
			if(o1.getName().compareTo(o2.getName())>0) return 1;
			else if(o1.getName().compareTo(o2.getName())<0) return -1;
			return 0;
		}
		
	};
	
	@Override
	public int compareTo(Star o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

	

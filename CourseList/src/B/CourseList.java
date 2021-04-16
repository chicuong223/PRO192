package B;

import java.util.ArrayList;
import A.Course;

public class CourseList {
	ArrayList<Course> list;
	public CourseList() {
		list=new ArrayList<Course>();
	}
	public boolean addCourse(String name, int Hours) {
		Course c = new Course(name, Hours);
		list.add(c);
		return true;
	}
	public void updateCourse(int oldHours, int newHours) {
		for (Course course : list) {
			if(course.getHours()==oldHours) {
				course.setHours(newHours);
			}
		}
	}
	public void display() {
		for (Course course : list) {
			System.out.println("Name: " + course.getName());
			System.out.println("Hours: " + course.getHours());
		}
	}
}

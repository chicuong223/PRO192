import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Chi-Cuong
 *
 */
public class StudentList {
	ArrayList<Student> list;
	public StudentList() {
		list = new ArrayList<>();
	}
	
	
	public boolean add(Student stu) {
		if(stu==null) return false;
		list.add(stu);
		return true;
	}
	
	public void output() {
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	public int findStudent(String idFind) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).id.equalsIgnoreCase(idFind)) return i;
		}
		return -1;
	}
	
	public boolean removeStudent(String idRemove) {
		int iRemove=findStudent(idRemove);
		if (iRemove==-1) return false;
		else list.remove(iRemove);
		return true;
	}
	
	public void displayStudent(int index) {
		System.out.println(list.get(index));
	}
}

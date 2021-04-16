import java.util.ArrayList;
import java.util.Scanner;

import DAO.fileDAO;
import DTO.Student;

/**
 * 
 */

/**
 * @author chiuy
 *
 */
public class StudentList {
	ArrayList<Student> list;
	public static final String filename = "Book1.txt";
	private Scanner sc;
	public StudentList() {
		list = fileDAO.loadStudents(filename);
	}
	
	//them 1 SV moi x vo list
	//ghi vo file
	public boolean addStudent(Student x) {
		if(list==null) return false;
		list.add(x);	//them vo list
		fileDAO.writeStudents(list, filename);	//ghi vo file
		return true;
	}
	
	//tim SV theo ma
	public int findStudent(String id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) 
				return i;
		}
		return -1;
	}
	//sua thong-tin SV khi biet ma
	public boolean editStudent(String id) {
		int pos=findStudent(id);
		if(pos!=-1) {
			Student tmp=list.get(pos);
			sc = new Scanner(System.in);
			System.out.println("New name: ");
			sc=new Scanner(System.in);
			tmp.setName(sc.nextLine());
			System.out.println("New email: ");
			sc=new Scanner(System.in);
			tmp.setEmail(sc.nextLine());
			System.out.println("New PE: ");
			tmp.setPE(sc.nextDouble());
			System.out.println("New FE: ");
			tmp.setFE(sc.nextDouble());
			fileDAO.writeStudents(list, filename);
			return true;
		}
		return false;
	}
	public void removeStudent(String id) {
		int pos=findStudent(id);
		if(pos!=-1) {
			list.remove(pos);
			fileDAO.writeStudents(list, filename);
		}
	}
	
	public void display() {
		for (Student student : list) {
			System.out.println(student);
		} 
	}
}

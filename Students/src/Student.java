import java.util.Scanner;

/**
 * 
 */

/**
 * @author Chi-Cuong
 *
 */
public class Student {
	String id;
	String campus;
	String major;
	String name;
	public Student() {
		id="";
		campus="";
		major="";
		name = "";
	}
	public Student(String id, String campus, String major, String name) {
		this.id = id;
		this.campus = campus;
		this.major = major;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", campus=" + campus + "]";
	}
	public void input() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ID: ");
		sc = new Scanner(System.in);
		id=sc.nextLine();
		System.out.println("Name: ");
		sc = new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Major: ");
		sc = new Scanner(System.in);
		major=sc.nextLine();
		boolean enter=true;
		do {
			try {
				System.out.println("Campus: ");
				sc = new Scanner(System.in);
				campus=sc.nextLine();
				if(!campus.equalsIgnoreCase("Saigon") && !campus.equalsIgnoreCase("Hanoi") && !campus.equalsIgnoreCase("Danang") && !campus.equalsIgnoreCase("Cantho"))
					throw new Exception();
				else enter=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Campus does not exist");
				enter=true;
			}
		}while(enter);
	}
}

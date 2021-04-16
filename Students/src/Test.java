
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Chi-Cuong
 *
 */
public class Test {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList list = new StudentList();
		int choice=0;
		sc = new Scanner(System.in);
		do {
			System.out.println("1. Add a student");
			System.out.println("2. Print the list");
			System.out.println("3. Find a student");
			System.out.println("4. Remove a student");
			System.out.println("5. Exit");
			System.out.println("Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Student student = new Student();
				student.input();
				boolean add = list.add(student);
				if(add==true) System.out.println("Success!");
				else System.out.println("Failed to add student");
				break;
			case 2:
				list.output();
				break;
			case 3:
				String idFind;
				System.out.println("Enter ID: ");
				sc = new Scanner(System.in);
				idFind=sc.nextLine();
				int index = list.findStudent(idFind);
				if(index==-1) System.out.println("Not found!");
				else list.displayStudent(index);
				break;
			case 4:
				String idRemove;
				System.out.println("Enter ID: ");
				sc = new Scanner(System.in);
				idRemove=sc.nextLine();
				boolean remove=list.removeStudent(idRemove);
				if(remove==false) System.out.println("Not found!");
				else System.out.println("Student is removed");
				break;
			default:
				System.out.println("Goodbye!");
				break;
			}
		}while(choice>=1 && choice <5);
	}

}

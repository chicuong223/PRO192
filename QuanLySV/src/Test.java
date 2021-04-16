import java.util.Scanner;

import DTO.Student;

/**
 * 
 */

/**
 * @author Chi-Cuong
 *
 */
public class Test {

	/**
	 * @param args
	 */
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int choice;
				StudentList obj = new StudentList();
				sc = new Scanner(System.in);
				do {
					System.out.println("1 - Add");
					System.out.println("2 - Edit");
					System.out.println("3 - Remove");
					System.out.println("4 - Display the list");
					System.out.println("5 - Exit");
					System.out.println("Your choice: ");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						String id, name, email;
						double pe, fe;
						System.out.println("Enter Id: ");
						sc=new Scanner(System.in);
						id=sc.nextLine();
						System.out.println("Enter name: ");
						sc=new Scanner(System.in);
						name=sc.nextLine();
						System.out.println("Enter email: ");
						sc=new Scanner(System.in);
						email=sc.nextLine();
						System.out.println("Enter practical exam's score: ");
						pe=sc.nextDouble();
						System.out.println("Enter final exam's score: ");
						fe=sc.nextDouble();
						Student x=new Student(id, name, email, pe, fe);
						boolean add=obj.addStudent(x);
						if(add==true) System.out.println("Success!");
						break;
					case 2:
						System.out.println("Enter Id to edit: ");
						sc=new Scanner(System.in);
						String idEdit=sc.nextLine();
						boolean edit=obj.editStudent(idEdit);
						if(edit==true) System.out.println("Success!");
						break;
					case 3:
						System.out.println("Enter Id to remove: ");
						sc=new Scanner(System.in);
						String idRemove=sc.nextLine();
						obj.removeStudent(idRemove);
						break;
					case 4:
						obj.display();
						break;
					}
				}while(choice>=1 && choice <5);
			}
}

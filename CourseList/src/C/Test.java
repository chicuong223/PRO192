package C;

import java.util.Scanner;

import B.CourseList;

public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseList cl=new CourseList();
		int choice;
		sc = new Scanner(System.in);
		do {
			System.out.println("1. Add a new course");
			System.out.println("2. Update a course by hours");
			System.out.println("3. Display all courses");
			System.out.println("4. Exit");
			System.out.print("Your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				String name;
				int Hours;
				do {
				System.out.print("Name: ");
				sc = new Scanner(System.in);
				name=sc.nextLine();
				if(name.isEmpty()) System.out.println("Name can't be empty");
				}
				while(name.isEmpty());
				do {
					System.out.print("Hours: ");
					Hours=sc.nextInt();
					if(Hours<1 || Hours>3) System.out.println("1<=Hours<=3. Please try again");
				}
				while(Hours<1 || Hours>3);
				cl.addCourse(name, Hours);
				break;
			case 2:
				System.out.print("Enter old hours: ");
				int oldHours=sc.nextInt();
				int newHours;
				do {
					System.out.print("Enter new hours: ");
					newHours=sc.nextInt();
					if(newHours<1 || newHours>3) System.out.println("1<=Hours<=3. Please try again!");
				}
				while(newHours<1 || newHours>3);
				cl.updateCourse(oldHours, newHours);
				break;
			case 3:
				cl.display();
				break;
			}
		}while(choice>=1 && choice<4);
	}

}

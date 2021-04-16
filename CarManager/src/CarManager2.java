import java.util.InputMismatchException;
import java.util.Scanner;

public class CarManager2 {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarList2 obj=new CarList2();
		int choice=0;
		sc = new Scanner(System.in);
		do {
			System.out.println("1 - Add");
			System.out.println("2 - Display");
			System.out.println("3 - Delete");
			System.out.println("4 - Update");
			System.out.println("5 - Sort by id");
			//System.out.println("6 - Sort by name");
			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				int id;
				String name;
				boolean enter=true;
				do {
					try {
						sc=new Scanner(System.in);
						System.out.print("id: ");
						id=sc.nextInt();
						System.out.print("name: ");
						sc = new Scanner(System.in);
						name = sc.nextLine();
						Car x = new Car(id, name);
						obj.addCar(x);
						enter=false;
					}
					catch(InputMismatchException e) {
						System.out.println("Invalid data");
						enter=true;
					}
				}while(enter);
				break;
			case 2:
				obj.displayAll();
				break;
			case 3:
				int id_Delete;
				enter=true;
				do {
					try {
						System.out.print("enter id: ");
						id_Delete=sc.nextInt();
						obj.deleteCar(id_Delete);
						enter=false;
					}
					catch(Exception e) {
						System.out.println("Invalid data");
						enter=true;
					}
				}while(enter);
				break;
			case 4:
				int id_Update;
				enter=true; 
				do {
					try {
						System.out.print("enter id: ");
						id_Update = sc.nextInt();
						obj.setCar(id_Update);
						enter=false;
					}
					catch (Exception e) {
						System.out.println("Invalid input");
						enter=true;
					}
				}while(enter);
				break;
			case 5:
				obj.displayAll();
				break;
				/*
			case 6:
				obj.sortName();
				obj.displayAll();
				break;
				*/
			}
		}
		while(choice>=1 && choice <6 );
	}

}

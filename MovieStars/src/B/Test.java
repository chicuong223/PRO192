package B;

import java.util.Scanner;

import A.Movie;

public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie obj=new Movie();
		int choice=0;
		sc = new Scanner(System.in);
		do {
			System.out.println("1. input");
			System.out.println("2. output");
			System.out.println("3. sort");
			System.out.println("4. exit");
			System.out.println("Choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				obj.input();
				break;
			case 2:
				obj.output();
				break;
			case 3:
				obj.sortByName();
				obj.output();
				break;
			default:
				System.out.println("Goodbye! Have a nice day!");
				break;
			}
		}while(choice>=1 && choice<4);
	}

}

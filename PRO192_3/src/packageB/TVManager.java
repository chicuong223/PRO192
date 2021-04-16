/**
 * 
 */
package packageB;

import java.util.Scanner;

import packageA.TV;

/**
 * @author Chi-Cuong
 *
 */
public class TVManager {
	
	private static Scanner sc;

	public static void main(String[] args) {
		int choice;
		listTV obj=new listTV();
		do {
			System.out.println("1 - Add a TV");
			System.out.println("2 - Find all TVs by size");
			System.out.println("3 - Sort by brand");
			System.out.println("5 - Exit");
			System.out.print("Choice: ");
			sc = new Scanner(System.in);
			sc = new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				TV x = obj.input();
				boolean add=obj.addItem(x);
				if(add==true) System.out.println("Successful!");
				break;
			case 2:
				System.out.println("Enter size: ");
				int m_size=sc.nextInt();
				obj.findAllTV(m_size);
				break;
			case 3:
				obj.sortByBrand();
				obj.output();
				break;
			}
		}while(choice>=1 && choice<4);
	}
}

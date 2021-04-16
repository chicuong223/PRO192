/**
 * 
 */
package packageB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import packageA.Electric;
import packageA.TV;

/**
 * @author Chi-Cuong
 *
 */
public class listTV {
	ArrayList<Electric> list;
	private Scanner sc;
	public listTV() {
		list = new ArrayList<Electric>();
	}
	boolean addItem(TV x) {
		if (x==null) return false;
		list.add(x);
		return true;
	}
	public void findAllTV(int m_size) {
		for (Electric electric : list) {
			if(((TV)electric).getSize()==m_size) System.out.println(electric); 
		}
	}
	public void sortByBrand() {
		Collections.sort(list, TV.byBrand);
	}
	
	public void output() {
		for (Electric electric : list) {
			System.out.println(((TV)electric));
		}
	}
	public TV input() {
		TV x = new TV();
		boolean input=true;
		System.out.print("Id: ");
		sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		x.id=sc.nextLine();
		System.out.print("Name: ");
		sc = new Scanner(System.in);
		x.name=sc.nextLine();
		do {
			try {
				System.out.print("Price: ");
				x.price=sc.nextInt();
				if(x.price<0) throw new Exception();
				input=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				input=true;
			}
			finally {
				sc.nextLine();
			}
		}while(input);
		input=true;
		do {
			try {
				System.out.print("Size: ");
				x.size=sc.nextInt();
				if(x.size<0) throw new Exception();
				input = false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid value");
				input=true;
			}
			finally {
				sc.nextLine();
			}
		}while(input);
		do {
			try {
				System.out.print("Brand: ");
				sc = new Scanner(System.in);
				x.brand=sc.nextLine();
				if(!x.brand.equalsIgnoreCase("Samsung") && !x.brand.equalsIgnoreCase("Sony")) throw new Exception();
				else input=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid data");
				input=true;
			}
		}while(input);
		return x;
	}
}

/**
 * 
 */
package packageB;

import java.util.Scanner;

import packageA.product;

/**
 * @author Chi-Cuong
 *
 */
public class Invoice {
	String code;
	Order order;
	public Invoice() {
		code = "";
		order = new Order();
	}
	int total;
	private Scanner sc;
	void input() {
		sc = new Scanner(System.in);
		System.out.print("Bill code: ");
		sc= new Scanner(System.in);
		code = sc.nextLine();
		String cont;
		do {
			product x = new product();
			x.input();
			order.add(x);
			System.out.println("Enter 'the end' to stop");
			sc=new Scanner(System.in);
			cont = sc.nextLine();
		}while(!cont.equals("the end"));
	}
	void output() {
		System.out.println("Bill code: " + code);
		System.out.println("Order details: ");
		order.display();
		int total=0;
		for(int i=0; i<order.list.size(); i++) {
			total +=order.list.get(i).getPrice();
		}
		System.out.println("Total: " + total + "$");
	}
}

/**
 * 
 */
package packageA;

import java.util.Scanner;

/**
 * @author Chi-Cuong
 *
 */
public class product {
	String code;
	String name;
	String size;
	int price;
	private static Scanner sc;
	public product(String code, String name, String size, int price) {
		this.code = code;
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	/**
	 * 
	 */
	public product() {
		// TODO Auto-generated constructor stub
		code = "";
		name = "";
		size = "";
		price = 0;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public product input(){
		sc = new Scanner(System.in);
		System.out.println("Code: ");
		sc= new Scanner(System.in);
		String code = sc.nextLine();
		System.out.println("Name: ");
		sc= new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Size: ");
		sc= new Scanner(System.in);
		String size=sc.nextLine();
		boolean nhaptiep=true;
		int price  = 0;
		do {
			try {
				System.out.println("Price: ");
				sc = new Scanner(System.in);
				price=sc.nextInt();
				nhaptiep=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid input");
				nhaptiep=true;
			}
		}while(nhaptiep);
		return new product(code, name, size, price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return code + "-" + name + "-" + size + "-" +price + "$";
	}
	
}

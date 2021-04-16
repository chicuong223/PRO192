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
		System.out.print("Product code: ");
		sc= new Scanner(System.in);
		code = sc.nextLine();
		System.out.print("Name: ");
		sc= new Scanner(System.in);
		name=sc.nextLine();
		System.out.print("Size: ");
		sc= new Scanner(System.in);
		size=sc.nextLine();
		boolean nhaptiep=true;
		//int price  = 0;
		do {
			try {
				System.out.print("Price: ");
				sc = new Scanner(System.in);
				price=sc.nextInt();
				if(price<0) throw new Exception();
				nhaptiep=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid data");
				nhaptiep=true;
			}
			finally {
				sc.nextLine();			}
		}while(nhaptiep);
		nhaptiep=true;
		return new product(code, name, size, price);
	}
	
	@Override
	public String toString() {
		return code + "-" + name + "-" + size + "-" + price + "$";
	}
	
}

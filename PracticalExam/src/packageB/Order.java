/**
 * 
 */
package packageB;

import java.util.ArrayList;

import packageA.product;

/**
 * @author Chi-Cuong
 *
 */
public class Order {
	ArrayList <product> list;
	public Order() {
		list = new ArrayList<product>();
	}
	void add(product x) {
		list.add(x);
	}
	void display() {
		for (product product : list) {
			System.out.println("\t" +product);
		}
	}
}

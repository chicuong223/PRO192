/**
 * 
 */
package packageA;

import java.util.Comparator;

/**
 * @author Chi-Cuong
 *
 */
public class TV extends Electric implements Comparable<Electric>{
	public int size;
	public String brand;
	static int volt=220;
	public TV() {
		super();
		size=0;
		brand="";
	}
	public TV(String id, String name, int price, int size, String brand) {
		super(id, name, price);
		this.size = size;
		this.brand = brand;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the volt
	 */
	public static int getVolt() {
		return volt;
	}
	/**
	 * @param volt the volt to set
	 */
	public static void setVolt(int volt) {
		TV.volt = volt;
	}
	@Override
	public String toString() {
		return "TV [id=" + id + ", name=" + name + ", price=" + price + ", size=" + size + ", brand=" + brand + ",volt=" + volt + "]";
	}
	
	@Override
	public int compareTo(Electric o) {
		// TODO Auto-generated method stub
		if(brand.compareToIgnoreCase(((TV)o).getBrand())>0) return 1;
		else if(brand.compareToIgnoreCase(((TV)o).getBrand())<0) return -1;
		return 0;
	}
	public static Comparator<Electric> byBrand = new Comparator<Electric>() {
		
		@Override
		public int compare(Electric o1, Electric o2) {
			// TODO Auto-generated method stub
			if(((TV)o1).getBrand().compareToIgnoreCase(((TV)o2).getBrand())>0) return 1;
			else if(((TV)o1).getBrand().compareToIgnoreCase(((TV)o2).getBrand())<0) return -1;
			return 0;
		}
	};
}

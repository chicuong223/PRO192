//DetectiveBook.java

package PkgBasic;

public class DetectiveBook extends Book{
	public int price;
	int yearofpublication;
	
	public DetectiveBook() {
		super();
		price=0;
		yearofpublication=0;
	}

	public DetectiveBook(String code, String title, int price, int yearofpublication) {
		super(code, title);
		this.price = price;
		this.yearofpublication = yearofpublication;
	}

	/*public DetectiveBook(DetectiveBook detectiveBook) {
		// TODO Auto-generated constructor stub
	}*/

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearofpublication() {
		return yearofpublication;
	}

	public void setYearofpublication(int yearofpublication) {
		this.yearofpublication = yearofpublication;
	}

	@Override
	public String toString() {
		return title + " - " + yearofpublication + " - " + price + "$; ";
	}

	
}

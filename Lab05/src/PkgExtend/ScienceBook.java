//ScienceBook.java

package PkgExtend;

import PkgBasic.Book;

public class ScienceBook extends Book{
	String type;

	public ScienceBook(String code, String title, String type) {
		super(code, title);
		this.type = type;
	}
	
	public ScienceBook() {
		super();
		type="";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return title + "; ";
	}
	
}

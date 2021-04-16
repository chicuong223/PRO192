//Book.java

package PkgBasic;

public class Book {
	protected String code;
	protected String title;
	
	public Book(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public Book() {
		code ="";
		title="";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [code=" + code + ", title=" + title + "]";
	}
}

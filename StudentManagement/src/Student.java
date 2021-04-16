
public class Student {
	int ma;
	String ten;
	public Student(int ma, String ten) {
		this.ma = ma;
		this.ten = ten;
	}
	
	public Student() {
		ma=0;
		ten="";
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	void output() {
		System.out.println("Mã: " +ma);
		System.out.println("Tên: " +ten);
	}
}

import java.util.Scanner;

public class Tester {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma;
		String ten;
		sc = new Scanner(System.in);
			System.out.print("Ten: ");
			ten=sc.nextLine();
			System.out.print("Ma: ");
			ma=sc.nextInt();
		Student st = new Student(ma, ten);
		st.output();
	}

}

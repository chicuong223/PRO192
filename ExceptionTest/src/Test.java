import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Chi-Cuong
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		do {
			try {
				System.out.println("Number: ");
				number=sc.nextInt();
				loop=false;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println(e);
				loop=true;
			}
			finally {
				sc.nextLine();
			}
		}while(loop);
		System.out.println(number);
	}

}

//BookTest.java

package BookTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import PkgBasic.Book;
import PkgBasic.DetectiveBook;
import PkgExtend.BookList;
import PkgExtend.ScienceBook;

public class BookTest {

	private static Scanner sc;
	
	public static boolean isValidCode(String code) {
		String validCode="B[0-9]{1,6}";
		Pattern pat = Pattern.compile(validCode);
		Matcher matcher = pat.matcher(code);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String code, title, type;
		int price, year;
		sc = new Scanner(System.in);
		BookList obj = new BookList();
		Book x = null;
		do {
			System.out.println("1 - Add a Detective Book");
			System.out.println("2 - Add a Science Book");
			System.out.println("3 - Delete a Book");
			System.out.println("4 - Update a Book");
			System.out.println("5 - Display all Detective Books");
			System.out.println("6 - Display all Science Books");
			System.out.println("7 - Search by code");
			System.out.println("8 - Search by title");
			System.out.println("9 - Search and display all books by year of publication");
			System.out.println("10 - Exit");
			System.out.print("Your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				do {
					System.out.print("Code: ");
					sc=new Scanner(System.in);
					code = sc.nextLine();
					if(isValidCode(code)==false) System.out.println("Invalid code");
				}while(isValidCode(code)==false);
				System.out.print("Title: ");
				sc=new Scanner(System.in);
				title=sc.nextLine();
				System.out.print("Price: ");
				price=sc.nextInt();
				System.out.print("Year of publication: ");
				year=sc.nextInt();
				x = new DetectiveBook(code, title, price, year);
				obj.Add(x);
				break;
			case 2:
				System.out.print("Code: ");
				sc=new Scanner(System.in);
				code = sc.nextLine();
				System.out.print("Title: ");
				sc=new Scanner(System.in);
				title=sc.nextLine();
				System.out.print("Type: ");
				sc=new Scanner(System.in);
				type = sc.nextLine();
				while(!type.equals("Physics") && !type.equals("Chemistry") && !type.equals("Mathematics")) {
					System.out.println("Invalid type!");
					System.out.print("Type: ");
					sc=new Scanner(System.in);
					type = sc.nextLine();
				}
				x = new ScienceBook(code, title, type);
				obj.Add(x);
				break;
			case 3:
				System.out.println("Enter code: ");
				sc=new Scanner(System.in);
				code = sc.nextLine();
				obj.Delete(code);
				break;
			case 4:
				System.out.println("Enter code: ");
				sc=new Scanner(System.in);
				code = sc.nextLine();
				obj.Update(code);
				break;
			case 5:
				System.out.print("List of Detective Books: ");
				obj.displayDetectiveBook();
				System.out.println("");
				break;
			case 6:
				System.out.print("List of Science Books: ");
				obj.displayScienceBook();
				System.out.println("");
				break;
			case 7:
				System.out.println("Enter code: ");
				sc=new Scanner(System.in);
				code = sc.nextLine();
				Book found = obj.Search(code);
				if(found == null) System.out.println("Not found!");
				else System.err.println(found);
				break;
			case 8:
				System.out.println("Enter title: ");
				sc=new Scanner(System.in);
				title = sc.nextLine();
				boolean found1=obj.search(title);
				if(found1==false) System.out.println("Not found!");
				break;
			case 9:
				System.out.println("Enter year of publication: ");
				year = sc.nextInt();
				obj.Search(year);
				break;
			default:
				System.out.println("Goodbye");
				break;
			}	
		}while(choice>=1 && choice<=9);
	}
}

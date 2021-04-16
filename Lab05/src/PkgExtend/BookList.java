//BookList.java

package PkgExtend;

import java.util.Scanner;
import PkgBasic.Book;
import PkgBasic.DetectiveBook;

public class BookList {
	final int MAX=100;
	private Book[] arr= new Book[MAX];
	private int count;
	private Scanner sc;
	
	public BookList() {
		arr = new Book[MAX];
		count=0;
	}
	
	//Add a known book to list
	 public void Add(Book x) {
		 if(count>=MAX || arr==null) {
			 System.out.println("Couldn't add book");
			 return;
		 }
		 arr[count] = x;
		 count++;
	}
	 
	 //Search a book by code
	 public Book Search(String code) {
		 for(int i=0; i<count; i++) {
			 if (arr[i].getCode().equals(code)) return arr[i];
		 }
		 return null;
	 }
	 
	 //Search books that have the same year of publication
	 public Book[] Search(int YearOfPublish) {
		 Book[] arr2 = new Book[count];
		 int count2=0;
		 for(int i=0; i<count; i++) {
			 if(arr[i] instanceof DetectiveBook) {
				 if(((DetectiveBook) arr[i]).getYearofpublication()==YearOfPublish){
					 arr2[count2]=new DetectiveBook();
					 arr2[count2]=arr[i];
					 System.err.println(arr2[count2]);
					 count2++;
				 }
			 }
		 }
		 return arr2;
}
	 
	 //print Detective Books
	 public void displayDetectiveBook() {
		 for(int i=0; i<count; i++) {
			 if(arr[i] instanceof DetectiveBook) {
				((DetectiveBook) arr[i]).toString();
				 System.err.print(arr[i]);
			 }
		 }
	 }
	 
	 //print Science Books
	 public void displayScienceBook() {
		 for(int i=0; i<count; i++) {
			 if(arr[i] instanceof ScienceBook) {
				((ScienceBook) arr[i]).toString();
				 System.err.print(arr[i]);
			 }
		 }
	 }
	 
	 //Delete a book by code
	 public void Delete(String code) {
		 Book find = Search(code);
		 if (find==null) {
			 System.out.println("Not found!");
			 return;
		 }
		 for(int i=0; i<count; i++) {
			 if(arr[i]==find) {
				 for(int k=i; k<count; k++) {
					 arr[k]=arr[k+1];
					 count--;
				 }
			 }
			 System.out.println("Done!");
		 }
	 }
	 
	 //Search a book by title
	 public boolean search(String title) {
		 for(int i=0; i<count; i++) {
			 if(arr[i].getTitle().equals(title)) {
				 System.err.println(arr[i]);
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 //Update details of a book
	 public void Update(String code) {
		 Book result = Search(code);
		 sc = new Scanner(System.in);
		 if(result ==null) {
			 System.out.println("Not found!");
			 return;
		 }
		 System.out.println("Title: ");
		 result.setTitle(sc.nextLine());
		 if(result instanceof DetectiveBook) {
			 System.out.println("Price: ");
			 ((DetectiveBook) result).setPrice(sc.nextInt());
			 System.out.println("Year of publication: ");
			 ((DetectiveBook) result).setYearofpublication(sc.nextInt());
		 }
		 else if(result instanceof ScienceBook) {
			 System.out.println("Type: ");
			 ((ScienceBook) result).setType(sc.nextLine());
		 }
		 System.err.println(result);
	 }
}
